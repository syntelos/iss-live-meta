package schema;

public class USLAB000039
    extends Schematic
{

    public USLAB000039(){
        super("USLAB000039","MASS","USLAB000039","12","sprintf","%5.4f","ISS Total Mass (kg)","ISS Total Mass (kg). Total mass of the ISS.");
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
