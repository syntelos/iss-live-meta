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

import schema.ConsoleSet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;

/**
 * Pull the ADCO data set.
 */
public class ControlSession
    extends Object
{

    String[] request;
    String content, body, response;
    boolean ok = false;

    ControlSession(CreateSession create, ConsoleSet consoleSet){
        if (null != create.session){

            content = "LS_session="+create.session+"&LS_table=2&LS_win_phase=49&LS_req_phase=172&LS_op=add&LS_mode=MERGE&LS_id=ISPWebItem&LS_schema="+consoleSet.join("%20")+"&LS_snapshot=true&LS_unique=1&";

            request = new String[]{
                "POST /lightstreamer/control.js HTTP/1.1\r\n",
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

        Object contentLength = headers.get("Content-Length");
        if (contentLength instanceof Integer){
            int len = ((Integer)contentLength).intValue();
            byte[] body = new byte[len];
            in.readFully(body,0,len);
            this.body = new String(body,0,0,len);

            System.out.println(this.body);
            System.out.println();
        }
        else {
            throw new IllegalStateException("ControlSession response missing content-length");
        }
    }
}
