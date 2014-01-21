/*
 * Copyright 2014, John Pritchard, Syntelos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;

/**
 * Read the data set defined by {@link ControlSession}.
 */
public class BindSession
    extends Object
{
    String[] request;
    String content;
    String response;
    boolean ok = false;

    public BindSession(CreateSession create){
        if (null != create.session){

            content = "LS_session="+create.session+"&LS_phase=7903&LS_domain=nasa.gov&";

            request = new String[]{
                "POST /lightstreamer/bind_session.js HTTP/1.1\r\n",
                "Host: push1.jsc.nasa.gov\r\n",
                "Content-Type: application/x-www-form-urlencoded\r\n",
                "Connection: keep-alive\r\n",
                "Content-Length: "+content.length()+"\r\n",
                "\r\n",
                content
            };

        }
        else
            throw new IllegalStateException(String.format("Missing session from '%s'",create.body));
    }

    void q(DataOutputStream ot)
        throws IOException
    {
        for (String q : this.request){
            ot.writeBytes(q);
            System.out.print(q);
        }
    }
    void p(DataInputStream in)
        throws IOException
    {
        System.out.println();
        HashMap<String,Object> headers = new HashMap();
        /*
         * Headers
         */
        boolean once = true;
        while (true){
            String linin = in.readLine();

            if (null == linin){

                throw new SessionTimeoutException();
            }
            else if (0 == linin.length())
                break;
            else {
                System.out.println(linin);
                if (once){
                    once = false;
                    response = linin;
                    ok = linin.startsWith("HTTP/1.1 200 ");
                }
                else {
                    Header header = new Header(linin);
                    if (null != header.integer)
                        headers.put(header.name,header.integer);
                    else 
                        headers.put(header.name,header.value);
                }
            }
        }
        System.out.println();

        int initialization = 0;

        while (true){

            Chunk data = new Chunk(in);

            if (0 < data.size()){
                initialization = 0;

                for (Chunk.Pair pair: data){

                    System.out.printf("%s(%s)=%s ",pair.name,pair.schematic.tmtc,pair.value);
                }
                System.out.println();
            }
            else if (data.input.startsWith("p();"))
            {
                System.out.print(data.input);

                // if (5 < polling)
                //     throw new BindTimeoutException();
                // else {
                //     polling++;
                // }
            }
            else if (data.input.startsWith("loop(0);"))
            {
                System.out.print(data.input);

                throw new SessionTimeoutException();
            }
            else if (data.input.startsWith("var ") ||
                     data.input.startsWith("c("))
            {
                System.out.print(data.input);

                if (5 < initialization)
                    throw new ControlTimeoutException();
                else {
                    initialization++;
                }
            }
            else {
                System.out.print(">?> "+data.input);

                throw new ControlTimeoutException("Not reached");
            }
        }
    }
}
