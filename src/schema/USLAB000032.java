package schema;

public class USLAB000032
    extends Schematic
{

    public USLAB000032(){
        super("USLAB000032","GNC_X","km","12","sprintf","%5.4f","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - X (km)","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - X (km). The X-component of the ISS position in the J2000 reference frame, a component of the state vector.");
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
