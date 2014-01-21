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

public class NODE3000004
    extends Schematic
{

    public NODE3000004(){
        super("NODE3000004","ETHOS","N3_URN_PROC","event","64","enum","2=STOP|4=SHUTDOWN|8=MAINTENANCE|16=NORMAL|32=STANDBY|64=IDLE|128=SYSTEM INITIALIZED","Urine Processor State","Urine Processor State. Status of the Urine Processor.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 2:
                return "STOP";
            case 4:
                return "SHUTDOWN";
            case 8:
                return "MAINTENANCE";
            case 16:
                return "NORMAL";
            case 32:
                return "STANDBY";
            case 64:
                return "IDLE";
            case 128:
                return "SYSTEM INITIALIZED";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
