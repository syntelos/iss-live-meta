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

public class USLAB000094
    extends Schematic
{

    public USLAB000094(){
        super("USLAB000094","IAC2","event","64","enum","0=Backup|1=Active","Internal Audio Controller (IAC) - IAC-2 Active/Backup Indication","Internal Audio Controller (IAC) - IAC-2 Active/Backup Indication");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "Backup";
            case 1:
                return "Active";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
