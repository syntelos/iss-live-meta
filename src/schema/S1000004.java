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

public class S1000004
    extends Schematic
{

    public S1000004(){
        super("S1000004","CRONUS","RFG1_AZ","degrees","12","sprintf","%5.4f","S-Band Radio Frequency Group (RFG 1) Azimuth Gimbal Position","S-Band Radio Frequency Group (RFG 1) Azimuth Gimbal Position");
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
