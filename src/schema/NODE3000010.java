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

public class NODE3000010
    extends Schematic
{

    public NODE3000010(){
        super("NODE3000010","ETHOS","N3_O2_GEN","event","64","enum","1=PROCESS|2=STANDBY|3=SHUTDOWN|4=STOP|5=VENT_DOME|6=INERT_DOME|7=FAST_SHUTDOWN|8=N2_PURGE_SHUTDOWN","Oxygen Generator State","Oxygen Generator State. Status of the Oxygen Generator.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 1:
                return "PROCESS";
            case 2:
                return "STANDBY";
            case 3:
                return "SHUTDOWN";
            case 4:
                return "STOP";
            case 5:
                return "VENT_DOME";
            case 6:
                return "INERT_DOME";
            case 7:
                return "FAST_SHUTDOWN";
            case 8:
                return "N2_PURGE_SHUTDOWN";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
