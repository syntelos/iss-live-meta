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

public class ConsoleSetArray
    extends Object
    implements ConsoleSet
{
    private final static Schematic[] EmptySet = new Schematic[0];


    private Schematic[] schematic;


    public ConsoleSetArray(){
        super();
        this.schematic = new Schematic[0];
    }
    public ConsoleSetArray(Schematic sch){
        super();
        if (null == sch)
            this.schematic = EmptySet;
        else
            this.schematic = new Schematic[]{sch};
    }
    public ConsoleSetArray(ConsoleSet set){
        this((null != set)?(set.schematic()):(EmptySet));
    }
    public ConsoleSetArray(Schematic[] schematic){
        super();
        if (null == schematic)
            this.schematic = EmptySet;
        else
            this.schematic = schematic;
    }


    public boolean isEmpty(){
        return (0 == schematic.length);
    }
    public boolean isNotEmpty(){
        return (0 != schematic.length);
    }
    public int count(){
        return schematic.length;
    }
    public Schematic get(int cc){
        if (-1 < cc && cc < schematic.length)
            return schematic[cc];
        else
            return null;
    }
    public ConsoleSetArray add(Schematic sch){
        if (null != sch){
            Schematic[] copier = new Schematic[schematic.length+1];
            System.arraycopy(schematic,0,copier,0,schematic.length);
            copier[schematic.length] = sch;
            schematic = copier;
        }
        return this;
    }
    public ConsoleSetArray add(Schematic[] sch){
        if (null != sch && 0 != sch.length){
            Schematic[] copier = new Schematic[schematic.length+sch.length];
            System.arraycopy(schematic,0,copier,0,schematic.length);
            System.arraycopy(sch,0,copier,schematic.length,sch.length);
            schematic = copier;
        }
        return this;
    }
    public ConsoleSetArray add(ConsoleSet set){
        if (null != set)
            return add(set.schematic());
        else
            return this;
    }
    public Schematic[] schematic(){
        return this.schematic.clone();
    }
    public String join(String sep){
        StringBuilder string = new StringBuilder();
        final int count = schematic.length;
        for (int cc = 0; cc < count; cc++){
            if (0 != cc){
                string.append(sep);
            }
            string.append(schematic[cc].name);
        }
        return string.toString();
    }
}
