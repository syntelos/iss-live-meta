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

public class AIRLOCK000048
    extends Schematic
{

    public AIRLOCK000048(){
        super("AIRLOCK000048","EVA","ARL_PUMP_SW","event","64","enum","0=PUMP OFF CMD|1=PUMP ON CMD","Pumps atmosphere from Airlock into Node one during depress, switch status.","Pumps atmosphere from Airlock into Node one during depress, switch status.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "PUMP OFF CMD";
            case 1:
                return "PUMP ON CMD";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
