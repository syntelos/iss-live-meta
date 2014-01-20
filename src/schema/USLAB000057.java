package schema;

public class USLAB000057
    extends Schematic
{

    public USLAB000057(){
        super("USLAB000057","LAB_MTL","USLAB000057","12","sprintf","%5.4f","Coolant water quantity, MT (Lab)","Coolant water quantity, MT (Lab). Lab Moderate Temperature Loop (MTL) water level.");
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
