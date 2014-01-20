package schema;

public class USLAB000034
    extends Schematic
{

    public USLAB000034(){
        super("USLAB000034","GNC_Z","km","12","sprintf","%5.4f","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - Z (km)","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - Z (km). The Z-component of the ISS position in the J2000 reference frame, a component of the state vector.");
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
