package schema;

public class USLAB000035
    extends Schematic
{

    public USLAB000035(){
        super("USLAB000035","GNC_DX","m/s","12","sprintf","%5.4f","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - X (m/s)","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - X (m/s). The X-component of the ISS velocity in the J2000 reference frame, a component of the state vector.");
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
