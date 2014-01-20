package schema;

public abstract class Schematic
    extends Object
{
    public final String name, tmtc, id, columns, formattype, format, desc_short, desc_long;

    protected Schematic(String name, String tmtc, String id, String columns, String formattype, String format, String desc_short, String desc_long){
        super();
        this.name = name;
        this.tmtc = tmtc;
        this.id = id;
        this.columns = columns;
        this.formattype = formattype;
        this.format = format;
        this.desc_short = desc_short;
        this.desc_long = desc_long;
    }

    public abstract Object parse(String value);

}
