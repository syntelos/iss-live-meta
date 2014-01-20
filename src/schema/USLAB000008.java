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

public class USLAB000008
    extends Schematic
{

    public USLAB000008(){
        super("USLAB000008","CMG_CT_Y","N-m","12","sprintf","%5.4f","Control Moment Gyroscope (CMG) Control Torque - Yaw (N-m)","Control Moment Gyroscope (CMG) Control Torque - Yaw (N-m). The commanded control torque requested by GNC software in the yaw axis of the ISS.");
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
