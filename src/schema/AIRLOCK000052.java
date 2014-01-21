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

public class AIRLOCK000052
    extends Schematic
{

    public AIRLOCK000052(){
        super("AIRLOCK000052","ETHOS","ARL_N2","event","64","enum","0=CLOSED|1=OPEN|2=IN-TRANSIT|3=FAILED","N2 Supply Valve position","N2 Supply Valve position. Position of the valve controlling the ISS nitrogen supply.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "CLOSED";
            case 1:
                return "OPEN";
            case 2:
                return "IN-TRANSIT";
            case 3:
                return "FAILED";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
