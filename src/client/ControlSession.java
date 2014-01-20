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

public class ControlSession
    extends Object
{
    String[] request;
    String content, body, response;
    boolean ok;

    ControlSession(CreateSession create){
        if (null != create.session){

            content = "LS_session="+create.session+"&LS_table=2&LS_win_phase=49&LS_req_phase=172&LS_op=add&LS_mode=MERGE&LS_id=ISPWebItem&LS_schema=USLAB000001%20USLAB000002%20USLAB000003%20USLAB000004%20USLAB000005%20USLAB000006%20USLAB000007%20USLAB000008%20USLAB000009%20USLAB000010%20USLAB000011%20USLAB000012%20USLAB000013%20USLAB000014%20USLAB000015%20USLAB000016%20USLAB000017%20USLAB000018%20USLAB000019%20USLAB000020%20USLAB000021%20USLAB000022%20USLAB000023%20USLAB000024%20USLAB000025%20USLAB000026%20USLAB000027%20USLAB000028%20USLAB000029%20USLAB000030%20USLAB000031%20USLAB000032%20USLAB000033%20USLAB000034%20USLAB000035%20USLAB000036%20USLAB000037%20USLAB000038%20USLAB000039%20USLAB000040%20USLAB000041%20USLAB000042%20USLAB000043%20USLAB000044%20USLAB000045%20USLAB000046%20USLAB000047%20USLAB000048%20USLAB000049%20USLAB000050%20USLAB000051%20USLAB000052%20Z1000001%20Z1000002%20Z1000003%20Z1000004%20Z1000005%20Z1000006%20Z1000007%20Z1000008%20Z1000009%20Z1000010%20Z1000011%20Z1000012&LS_snapshot=true&LS_unique=1&";

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

            System.out.println(this.body);
            System.out.println();
        }
        else {
            throw new IllegalStateException("ControlSession response missing content-length");
        }
    }
}
