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

public class USLAB000014
    extends Schematic
{

    public USLAB000014(){
        super("USLAB000014","ADCO","RATE_SRC","event","64","enum","0=NONE|1=RGA1|2=RGA2|3=RUSSIAN","US Rate Source","US Rate Source. The selected source of angular rate data to the GNC software, which is used to propagate attitude between updates. Options are RGA 1 or RGA 2 (redundant rate sensors which calculate rate using ring laser gyroscopes), or Russian (angular rate data calculated on the Russian Segment).");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "NONE";
            case 1:
                return "RGA1";
            case 2:
                return "RGA2";
            case 3:
                return "RUSSIAN";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
