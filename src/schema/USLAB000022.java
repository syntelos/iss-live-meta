package schema;

public class USLAB000022
    extends Schematic
{

    public USLAB000022(){
        super("USLAB000022","ATT_R_E","USLAB000022","12","sprintf","%5.4f","US Attitude Roll Error (deg)","US Attitude Roll Error (deg). The error between the current and commanded ISS orientation in the roll axis.");
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
