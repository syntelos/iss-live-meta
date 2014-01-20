package schema;

public class USLAB000036
    extends Schematic
{

    public USLAB000036(){
        super("USLAB000036","GNC_DY","m/s","12","sprintf","%5.4f","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - Y (m/s)","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - Y (m/s). The Y-component of the ISS velocity in the J2000 reference frame, a component of the state vector.");
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
