package schema;

public class USLAB000007
    extends Schematic
{

    public USLAB000007(){
        super("USLAB000007","CMG_CT_P","USLAB000007","12","sprintf","%5.4f","Control Moment Gyroscope (CMG) Control Torque - Pitch (N-m)","Control Moment Gyroscope (CMG) Control Torque - Pitch (N-m). The commanded control torque requested by GNC software in the pitch axis of the ISS.");
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
