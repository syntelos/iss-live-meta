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

public class USLAB000086
    extends Schematic
{

    public USLAB000086(){
        super("USLAB000086","ISS_M","event","64","enum","1=Standard|2=Microgravity|4=Reboost|8=Proximity_Ops|16=External_Ops|32=Survival|64=ASCR|127=all_modes","ISS Station Mode","ISS Station Mode");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 1:
                return "Standard";
            case 2:
                return "Microgravity";
            case 4:
                return "Reboost";
            case 8:
                return "Proximity_Ops";
            case 16:
                return "External_Ops";
            case 32:
                return "Survival";
            case 64:
                return "ASCR";
            case 127:
                return "all_modes";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
