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

public class USLAB000042
    extends Schematic
{

    public USLAB000042(){
        super("USLAB000042","ADCO","LOAC_ISS","event","64","enum","0=FALSE|1=TRUE","Loss of ISS Attitude Control (LOAC) Caution Message In Alarm","Loss of ISS Attitude Control (LOAC) Caution Message In Alarm. Defines when the US Segment has declared a loss of ISS attitude control.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "FALSE";
            case 1:
                return "TRUE";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
