package schema;

public class USLAB000056
    extends Schematic
{

    public USLAB000056(){
        super("USLAB000056","LAB_LTL","kg","12","sprintf","%5.4f","Coolant water quantity, LT (Lab)","Coolant water quantity, LT (Lab). Lab Low Temperature Loop (LTL) water level");
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
