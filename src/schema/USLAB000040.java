package schema;

public class USLAB000040
    extends Schematic
{

    public USLAB000040(){
        super("USLAB000040","SOL_B","degrees","12","sprintf","%5.4f","Solar Beta Angle (degrees)","Solar Beta Angle (degrees). Angle between the orbital plane and the ecliptic plane. Affects the amount of time the ISS is in eclipse each orbit.");
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
