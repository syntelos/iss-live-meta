package schema;

public class USLAB000033
    extends Schematic
{

    public USLAB000033(){
        super("USLAB000033","GNC_Y","km","12","sprintf","%5.4f","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - Y (km)","US Guidance, Navigation and Control (GNC) J2000 Propagated State Vector - Y (km). The Y-component of the ISS position in the J2000 reference frame, a component of the state vector.");
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
