package schema;

public class USLAB000008
    extends Schematic
{

    public USLAB000008(){
        super("USLAB000008","CMG_CT_Y","USLAB000008","12","sprintf","%5.4f","Control Moment Gyroscope (CMG) Control Torque - Yaw (N-m)","Control Moment Gyroscope (CMG) Control Torque - Yaw (N-m). The commanded control torque requested by GNC software in the yaw axis of the ISS.");
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
