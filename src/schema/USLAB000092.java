package schema;

public class USLAB000092
    extends Schematic
{

    public USLAB000092(){
        super("USLAB000092","ASSB","GHz","12","sprintf","%5.4f","Active String of S-Band","Active String of S-Band");
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
