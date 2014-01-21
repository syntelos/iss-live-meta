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

public class AIRLOCK000010
    extends Schematic
{

    public AIRLOCK000010(){
        super("AIRLOCK000010","EVA","ARL_EMU2_I","amperes","12","sprintf","%5.4f","Supplies power to the spacesuits (EVA Mobility Unit, EMU 2), Current","Supplies power to the spacesuits (EVA Mobility Unit = EMU s).");
    }


    public Object parse(String string){
        try {
            return new Float(string);
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
