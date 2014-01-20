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

public class AIRLOCK000021
    extends Schematic
{

    public AIRLOCK000021(){
        super("AIRLOCK000021","ARL_BCA3","event","64","enum","0=Normal|1=No Data|2=Missing  Data|3=Extra Data","Battery Charger Assembly (BCA) 3 Status","Battery Charger Assembly (BCA) 3 Status");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "Normal";
            case 1:
                return "No Data";
            case 2:
                return "Missing  Data";
            case 3:
                return "Extra Data";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
