package schema;

public class USLAB000025
    extends Schematic
{

    public USLAB000025(){
        super("USLAB000025","ATT_RATE_X","USLAB000025","12","sprintf","%5.4f","US Inertial Attitude Rate X (deg/s)","US Inertial Attitude Rate X (deg/s). The angular rate of the ISS about the roll axis with respect to inertial space.");
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
