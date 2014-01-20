
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class schema
{
    public final String name, tmtc, units, columns, formattype, format, desc_short, desc_long;

    public schema(String name, String tmtc, String units, String columns, String formattype, String format, String desc_short, String desc_long){

        this.name = name;
        this.tmtc = tmtc;
        this.units = units;
        this.columns = columns;
        this.formattype = formattype;
        this.format = format;
        this.desc_short = desc_short;
        this.desc_long = desc_long;
    }


    public static void main(String[] argv){
        File schema = new File("schema.tsv");
        if (schema.exists()){

            PrintStream out;
            try {

                ArrayList<schema> list = new ArrayList();
                DataInputStream in = new DataInputStream(new FileInputStream(schema));
                String linin;
                while (null != (linin = in.readLine())){

                    StringTokenizer strtok = new StringTokenizer(linin,"\t");

                    schema schematic = new schema(strtok.nextToken(),strtok.nextToken(),strtok.nextToken(),strtok.nextToken(),strtok.nextToken(),strtok.nextToken(),strtok.nextToken(),strtok.nextToken());

                    list.add(schematic);
                }
                in.close();
                /*
                 */
                File schema_dir = new File("src/schema"), tgt;
                if (schema_dir.exists() || schema_dir.mkdirs()){
                    /*
                     */
                    tgt = new File(schema_dir,"Schematic.java");
                    System.out.printf("Writing %s%n",tgt.getName());

                    out = new PrintStream(new FileOutputStream(tgt));
                    out.println("/*");
                    out.println(" * Copyright 2014, John Pritchard, Syntelos");
                    out.println(" *");
                    out.println(" * Licensed under the Apache License, Version 2.0 (the \"License\");");
                    out.println(" * you may not use this file except in compliance with the License.");
                    out.println(" * You may obtain a copy of the License at");
                    out.println(" *");
                    out.println(" *     http://www.apache.org/licenses/LICENSE-2.0");
                    out.println(" *");
                    out.println(" * Unless required by applicable law or agreed to in writing, software");
                    out.println(" * distributed under the License is distributed on an \"AS IS\" BASIS,");
                    out.println(" * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.");
                    out.println(" * See the License for the specific language governing permissions and");
                    out.println(" * limitations under the License.");
                    out.println(" */");
                    out.println("package schema;");
                    out.println();
                    out.println("public abstract class Schematic");
                    out.println("    extends Object");
                    out.println("{");
                    out.println("    public final String name, tmtc, units, columns, formattype, format, desc_short, desc_long;");
                    out.println();
                    out.println("    protected Schematic(String name, String tmtc, String units, String columns, String formattype, String format, String desc_short, String desc_long){");
                    out.println("        super();");
                    out.println("        this.name = name;");
                    out.println("        this.tmtc = tmtc;");
                    out.println("        this.units = units;");
                    out.println("        this.columns = columns;");
                    out.println("        this.formattype = formattype;");
                    out.println("        this.format = format;");
                    out.println("        this.desc_short = desc_short;");
                    out.println("        this.desc_long = desc_long;");
                    out.println("    }");
                    out.println();
                    out.println("    public abstract Object parse(String value);");
                    out.println();
                    out.println("}");
                    out.close();
                    /*
                     */
                    tgt = new File(schema_dir,"Schema.java");
                    System.out.printf("Writing %s%n",tgt.getName());

                    out = new PrintStream(new FileOutputStream(tgt));

                    out.println("package schema;");
                    out.println();
                    out.println("public enum Schema");
                    out.println("{");
                    out.println();

                    int count = list.size();
                    int term = (count-1);
                    
                    for (int cc = 0; cc < count; cc++){
                        schema schematic = list.get(cc);
                        if (cc < term)
                            out.printf("    %s(new schema.%s()),%n",schematic.name,schematic.name);
                        else
                            out.printf("    %s(new schema.%s());%n",schematic.name,schematic.name);
                    }

                    out.println();
                    out.println();
                    out.println("    public final static Schematic For(String name){");
                    out.println("        try {");
                    out.println("            return valueOf(name).schematic;");
                    out.println("        }");
                    out.println("        catch (RuntimeException exc){");
                    out.println("            return null;");
                    out.println("        }");
                    out.println("    }");
                    out.println("    public final Schematic schematic;");
                    out.println();
                    out.println("    private Schema(Schematic s){");
                    out.println("        schematic = s;");
                    out.println("    }");
                    out.println();
                    out.println("}");
                    out.close();
                    /*
                     */
                    for (schema schematic: list){
                        tgt = new File(schema_dir,schematic.name+".java");
                        System.out.printf("Writing %s%n",tgt.getName());

                        out = new PrintStream(new FileOutputStream(tgt));

                        out.println("/*");
                        out.println(" * Copyright 2014, John Pritchard, Syntelos");
                        out.println(" *");
                        out.println(" * Licensed under the Apache License, Version 2.0 (the \"License\");");
                        out.println(" * you may not use this file except in compliance with the License.");
                        out.println(" * You may obtain a copy of the License at");
                        out.println(" *");
                        out.println(" *     http://www.apache.org/licenses/LICENSE-2.0");
                        out.println(" *");
                        out.println(" * Unless required by applicable law or agreed to in writing, software");
                        out.println(" * distributed under the License is distributed on an \"AS IS\" BASIS,");
                        out.println(" * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.");
                        out.println(" * See the License for the specific language governing permissions and");
                        out.println(" * limitations under the License.");
                        out.println(" */");
                        out.println("package schema;");
                        out.println();
                        out.printf( "public class %s%n",schematic.name);
                        out.println("    extends Schematic");
                        out.println("{");
                        out.println();
                        out.printf( "    public %s(){%n",schematic.name);
                        out.printf( "        super(\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\",\"%s\");%n", schematic.name, schematic.tmtc, schematic.units, schematic.columns, schematic.formattype, schematic.format, schematic.desc_short, schematic.desc_long);
                        out.println("    }");
                        out.println();
                        out.println();
                        out.println("    public Object parse(String string){");
                        out.printf( "        try {%n");

                        if ("sprintf".equals(schematic.formattype))
                        {
                            out.printf( "            return new Float(string);%n");
                        }
                        else if (0 < schematic.format.indexOf('|')){

                            out.printf( "            int iv = Integer.parseInt(string);%n");
                            out.printf( "            switch(iv){%n");
                            StringTokenizer enumeration = new StringTokenizer(schematic.format,"|");
                            while (enumeration.hasMoreTokens()){

                                StringTokenizer nvpair = new StringTokenizer(enumeration.nextToken(),"=");
                                out.printf( "            case %s:%n",nvpair.nextToken());
                                out.printf( "                return \"%s\";%n",nvpair.nextToken());
                            }
                            out.printf( "            default:%n");
                            out.printf( "                return string;%n");
                            out.printf( "            }%n");
                        }
                        else {
                            out.printf( "            return new Float(string);%n");
                        }
                        out.printf( "        }%n");
                        out.printf( "        catch (NumberFormatException exc){%n");
                        out.printf( "            return string;%n");
                        out.printf( "        }%n");
                        out.println("    }");
                        out.println();
                        out.println("}");
                        out.close();

                    }
                }
            }
            catch (Exception exc){
                exc.printStackTrace();
                System.exit(1);
            }
        }
        else {
            System.err.println("Error: file not found 'schema.txt'");
            System.exit(1);
        }
    }
}
