package schema;

public class NODE3000002
    extends Schematic
{

    public NODE3000002(){
        super("NODE3000002","N3_PPN2","NODE3000002","12","sprintf","%5.4f","Node 3 ppN2","Node 3 ppN2. Nitrogen level measured by Node 3 Sensors.");
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
