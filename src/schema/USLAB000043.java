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

public class USLAB000043
    extends Schematic
{

    public USLAB000043(){
        super("USLAB000043","GPS1","event","64","enum","0=DOING POSITION FIXES|1=SV TIMING|2=APPROXIMATE TIMING|3=GPS TIME|4=NEED INITIALIZATION|5=GDOP NEEDED|6=BAD TIMING|7=NO USABLE SAT|8=TRACK 1 SAT|9=TRACK 2 SAT|10=TRACK 3 SAT|11=BAD INTEGRITY|12=NO VEL AVAIL|13=UNUSABLE FIX","Global Positioning System (GPS-1) Ops Status","Global Positioning System (GPS-1) Ops Status. Operational status of the software processes occurring in GPS 1.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "DOING POSITION FIXES";
            case 1:
                return "SV TIMING";
            case 2:
                return "APPROXIMATE TIMING";
            case 3:
                return "GPS TIME";
            case 4:
                return "NEED INITIALIZATION";
            case 5:
                return "GDOP NEEDED";
            case 6:
                return "BAD TIMING";
            case 7:
                return "NO USABLE SAT";
            case 8:
                return "TRACK 1 SAT";
            case 9:
                return "TRACK 2 SAT";
            case 10:
                return "TRACK 3 SAT";
            case 11:
                return "BAD INTEGRITY";
            case 12:
                return "NO VEL AVAIL";
            case 13:
                return "UNUSABLE FIX";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
