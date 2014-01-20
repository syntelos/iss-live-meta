package schema;

public class Z1000006
    extends Schematic
{

    public Z1000006(){
        super("Z1000006","CMG2_SM_I","Z1000006","12","sprintf","%5.4f","Control Moment Gyroscope (CMG)-2 Spin Motor Current (amps)","Control Moment Gyroscope (CMG)-2 Spin Motor Current (amps). Commanded current of the CMG-2 Spin Motor, used to control the wheel speed.");
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
