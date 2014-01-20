package schema;

public class Z1000007
    extends Schematic
{

    public Z1000007(){
        super("Z1000007","CMG3_SM_I","amperes","12","sprintf","%5.4f","Control Moment Gyroscope (CMG)-3 Spin Motor Current (amps)","Control Moment Gyroscope (CMG)-3 Spin Motor Current (amps). Commanded current of the CMG-3 Spin Motor, used to control the wheel speed.");
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
