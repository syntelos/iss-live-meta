package schema;

public class USLAB000058
    extends Schematic
{

    public USLAB000058(){
        super("USLAB000058","LAB_PRES","torr","12","sprintf","%5.4f","Cabin pressure","Cabin pressure. Pressure in the US Lab.");
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
