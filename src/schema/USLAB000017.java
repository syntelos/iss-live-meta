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

public class USLAB000017
    extends Schematic
{

    public USLAB000017(){
        super("USLAB000017","ADCO","ATT_CTL_REF","event","64","enum","0=LVLH|1=Inertial|2=XPOP","Attitude Control Reference Frame","Attitude Control Reference Frame. The reference set of axes to which the orientation of the ISS is controlled. LVLH refers to local vertical-local horizontal, similar to an airplane frame of reference with the ground below and the front facing along direction of travel. Inertial refers to the J2000 coordinate system located at the center of the earth and fixed with respect to the stars. XPOP, or X-axis Perpendicular to Orbital Plane, refers to a retired reference frame that was used during previous configurations of the ISS electrical power system.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "LVLH";
            case 1:
                return "Inertial";
            case 2:
                return "XPOP";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
