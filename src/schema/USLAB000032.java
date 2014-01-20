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

public class USLAB000032
    extends Schematic
{

    public USLAB000032(){
        super("USLAB000032","GNC_X","km","12","sprintf","%5.4f","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - X (km)","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - X (km). The X-component of the ISS position in the J2000 reference frame, a component of the state vector.");
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
