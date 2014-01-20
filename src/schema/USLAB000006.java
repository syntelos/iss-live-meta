package schema;

public class USLAB000006
    extends Schematic
{

    public USLAB000006(){
        super("USLAB000006","CMG_CT_R","N-m","12","sprintf","%5.4f","Control Moment Gyroscope (CMG) Control Torque - Roll (N-m)","Control Moment Gyroscope (CMG) Control Torque - Roll (N-m). The commanded control torque requested by GNC software in the roll axis of the ISS.");
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
