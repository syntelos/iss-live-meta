package schema;

public class USLAB000023
    extends Schematic
{

    public USLAB000023(){
        super("USLAB000023","ATT_P_E","USLAB000023","12","sprintf","%5.4f","US Attitude Pitch Error (deg)","US Attitude Pitch Error (deg). The error between the current and commanded ISS orientation in the pitch axis.");
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
