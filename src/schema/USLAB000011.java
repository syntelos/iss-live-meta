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

public class USLAB000011
    extends Schematic
{

    public USLAB000011(){
        super("USLAB000011","DESAT_Q","event","64","enum","0=ENABLED|1=INHIBITED","Desaturation Request (Enabled/Inhibited)","Desaturation Request (Enabled/Inhibited). Provides status of whether desaturation thruster firings are permitted.  Desaturations help prevent the CMG system from saturation, or 100% momentum percentage, by reducing the active CMG momentum.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "ENABLED";
            case 1:
                return "INHIBITED";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
