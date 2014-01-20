package schema;

public class USLAB000037
    extends Schematic
{

    public USLAB000037(){
        super("USLAB000037","GNC_DZ","m/s","12","sprintf","%5.4f","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - Z (m/s)","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - Z (m/s). The Z-component of the ISS velocity in the J2000 reference frame, a component of the state vector.");
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
