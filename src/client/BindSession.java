package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class BindSession
    extends Object
{
    String[] request;
    String content;
    String response;
    boolean ok;

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

        while (true){
            int ch = in.read();
            if (0 < ch){
                System.out.write(ch);
            }
            else
                break;
        }
    }
}
