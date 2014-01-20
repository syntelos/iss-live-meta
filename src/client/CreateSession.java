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
 * Initialize the control + bind protocol.
 */
public class CreateSession
    extends Object
{
    public final String[] request;
    public String response, body, session;
    public boolean ok;

    CreateSession(){

        request = new String[]{
            "POST /lightstreamer/create_session.js HTTP/1.1\r\n",
            "Host: push1.jsc.nasa.gov\r\n",
            "Content-Type: application/x-www-form-urlencoded\r\n",
            "Connection: keep-alive\r\n",
            "Content-Length: 138\r\n",
            "\r\n",
            "LS_phase=7901&LS_domain=nasa.gov&LS_polling=true&LS_polling_millis=0&LS_idle_millis=0&LS_client_version=5.0&LS_adapter_set=PROXYTELEMETRY&"
        };
    }

    void q(DataOutputStream ot)
        throws IOException
    {
        for (String q : this.request){
            ot.writeBytes(q);
            System.out.println(q);
        }
    }
    void p(DataInputStream in)
        throws IOException
    {
        HashMap<String,Object> headers = new HashMap();

        /*
         * Headers
         */
        boolean once = true;
        while (true){
            String linin = in.readLine();

            if (0 == linin.length())
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
            int parse = this.body.indexOf("start('");
            if (0 < parse){
                String session = this.body.substring(parse+"start('".length());
                parse = session.indexOf('\'');
                if (0 < parse){
                    this.session = session.substring(0,parse);
                    System.out.println();
                }
                else
                    throw new IllegalStateException(String.format("CreateSession response missing session in '%s'%n",this.body));
            }
            else
                throw new IllegalStateException(String.format("CreateSession response missing session in '%s'%n",this.body));
        }
        else {
            throw new IllegalStateException("CreateSession response missing content-length");
        }
    }
}
