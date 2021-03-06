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
package client;

public class Header
{

    public final String name, value;

    public final Integer integer;

    public Header(String line){
        int idx = line.indexOf(':');
        this.name = line.substring(0,idx).trim();
        this.value = line.substring(idx+1).trim();
        {
            Integer integer = null;
            try {
                integer = new Integer(this.value);
            }
            catch (NumberFormatException exc){
            }
            this.integer = integer;
        }
    }
}
