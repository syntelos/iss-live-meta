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
package schema;

public class USLAB000016
    extends Schematic
{

    public USLAB000016(){
        super("USLAB000016","ATT_CTL","event","64","enum","0=ATTITUDE HOLD|1=MOM MGMT","Attitude Controller Type","Attitude Controller Type. Indicates the type of attitude controller utilized by the US GNC. An Attitude Hold controller is used to minimize error in the attitude of the ISS, while sacrificing momentum margin. A Momentum Management controller is used to minimize the active CMG momentum, while sacrificing attitude error.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "ATTITUDE HOLD";
            case 1:
                return "MOM MGMT";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
