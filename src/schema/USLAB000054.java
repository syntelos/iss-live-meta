package schema;

public class USLAB000054
    extends Schematic
{

    public USLAB000054(){
        super("USLAB000054","LAB_PPN2","torr","12","sprintf","%5.4f","Lab ppN2","Lab ppN2. Nitrogen level measured by Lab Sensors.");
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
