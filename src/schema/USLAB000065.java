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

public class USLAB000065
    extends Schematic
{

    public USLAB000065(){
        super("USLAB000065","LAB_AC_S","event","64","enum","0=RESET|1=DRAIN|2=DRYOUT|3=EIB OFF|4=OFF|5=ON|6=STARTUP|7=TEST","Lab Starboard Air Conditioner State","Lab Starboard Air Conditioner State. Status of the Lab s Starboard Air Coditioner/Fan.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "RESET";
            case 1:
                return "DRAIN";
            case 2:
                return "DRYOUT";
            case 3:
                return "EIB OFF";
            case 4:
                return "OFF";
            case 5:
                return "ON";
            case 6:
                return "STARTUP";
            case 7:
                return "TEST";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
