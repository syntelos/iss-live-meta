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

import schema.Schema;
import schema.Schematic;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * Parse the found JSON data chunk 
 */
public class Chunk
    extends java.util.ArrayList<Chunk.Pair>
{
    public static class Pair {
        String name, value;
        Schematic schematic;
    }

    public final String input;

    public Chunk(DataInputStream in)
        throws IOException
    {
        String linin = "";
        while (0 == linin.length()){
            linin = in.readLine();
            if (null == linin){
                throw new SessionTimeoutException();
            }
        }
        int len = Integer.parseInt(linin,16);
        byte[] chunk = new byte[len];
        in.readFully(chunk,0,len);
        String string = new String(chunk,0,0,len);

        this.input = string;

        StringTokenizer strtok = new StringTokenizer(string,"'");
        while (strtok.hasMoreTokens()){
            String jsonObject = strtok.nextToken();

            len = jsonObject.length();
            if (8 < len && '{' == jsonObject.charAt(0) && '}' == jsonObject.charAt(len-1)){

                Pair pair = new Pair();

                StringTokenizer jsonItem = new StringTokenizer(jsonObject,",}{][");
                while (jsonItem.hasMoreTokens()){
                    String jsonString = jsonItem.nextToken();
                    StringTokenizer namevalue = new StringTokenizer(jsonString,"\":");
                    int nvcount = namevalue.countTokens();
                    if (2 == nvcount){
                        String name = namevalue.nextToken();
                        String value = namevalue.nextToken();

                        if (name.equals("Name")){

                            pair.name = value;

                            pair.schematic = Schema.For(value);
                        }
                        else if (name.equals("Value")){

                            pair.value = value;
                        }
                        else if (name.equals("CalibratedData")){

                            pair.value = value;

                            break;
                        }
                    }
                }

                if (null != pair.name && null != pair.schematic && null != pair.value){

                    this.add(pair);
                }
            }
        }
    }
}
