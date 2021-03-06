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

public class P6000006
    extends Schematic
{

    public P6000006(){
        super("P6000006","CRONUS","P6_PVCU_2B_MDM1","event","64","enum","0=Not Enabled|1=Enabled","Photovolatic Control Unit (PVCU) - Solar Array - 2B Multiplexer/Demultiplexer (MDM) 120 Volt On-Off Status","Photovolatic Control Unit (PVCU) - Solar Array - 2B Multiplexer/Demultiplexer (MDM) 120 Volt On-Off Status");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "Not Enabled";
            case 1:
                return "Enabled";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
