package schema;

public class USLAB000059
    extends Schematic
{

    public USLAB000059(){
        super("USLAB000059","LAB_TEMP","USLAB000059","12","sprintf","%5.4f","Cabin temperature","Cabin temperature. Air Temperature in the US Lab.");
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
