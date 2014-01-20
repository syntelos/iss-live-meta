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

public abstract class Schematic
    extends Object
{
    public final String name, tmtc, units, columns, formattype, format, desc_short, desc_long;

    protected Schematic(String name, String tmtc, String units, String columns, String formattype, String format, String desc_short, String desc_long){
        super();
        this.name = name;
        this.tmtc = tmtc;
        this.units = units;
        this.columns = columns;
        this.formattype = formattype;
        this.format = format;
        this.desc_short = desc_short;
        this.desc_long = desc_long;
    }

    public abstract Object parse(String value);

}
