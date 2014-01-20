package schema;

public class USLAB000026
    extends Schematic
{

    public USLAB000026(){
        super("USLAB000026","ATT_RATE_Y","USLAB000026","12","sprintf","%5.4f","US Inertial Attitude Rate Y (deg/s)","US Inertial Attitude Rate Y (deg/s). The angular rate of the ISS about the pitch axis with respect to inertial space.");
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
