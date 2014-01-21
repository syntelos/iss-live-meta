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

public class USLAB000002
    extends Schematic
{

    public USLAB000002(){
        super("USLAB000002","ADCO","CMG2","event","64","enum","0=NOT IN USE|1=IN USE","Control Moment Gyroscope (CMG)-2 On-Line","Control Moment Gyroscope (CMG)-2 On-Line. Status flag indicating that CMG-2 is in active use for attitude control by the GNC software when the U.S. segment is in active control of the ISS.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "NOT IN USE";
            case 1:
                return "IN USE";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
