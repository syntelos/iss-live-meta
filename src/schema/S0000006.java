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

public class S0000006
    extends Schematic
{

    public S0000006(){
        super("S0000006","S0_TRRJ_B_M","event","64","enum","1=STANDBY|2=RESTART|3=CHECKOUT|4=DIRECTED_POSITION|5=AUTOTRACK|6=BLIND|7=SHUTDOWN|8=SWITCHOVER","External Thermal Control System (ETCS) - Thermal Radiator Rotating Joint (TRRJ) - Loop B - Software mode","External Thermal Control System (ETCS) - Thermal Radiator Rotating Joint (TRRJ) - Loop B - Software mode");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 1:
                return "STANDBY";
            case 2:
                return "RESTART";
            case 3:
                return "CHECKOUT";
            case 4:
                return "DIRECTED_POSITION";
            case 5:
                return "AUTOTRACK";
            case 6:
                return "BLIND";
            case 7:
                return "SHUTDOWN";
            case 8:
                return "SWITCHOVER";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
