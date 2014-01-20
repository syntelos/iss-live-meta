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

public class USLAB000009
    extends Schematic
{

    public USLAB000009(){
        super("USLAB000009","ACMG_MOM","Nms","12","sprintf","%5.4f","Active Control Moment Gyroscope (CMG) Momentum (Nms)","Active Control Moment Gyroscope (CMG) Momentum (Nms). The magnitude of the cumulative momentum vector produced by the on-line CMGs. Momentum increases as the CMGs exert a torque in a single direction over a period of time.");
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
