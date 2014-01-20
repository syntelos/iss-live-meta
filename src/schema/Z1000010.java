package schema;

public class Z1000010
    extends Schematic
{

    public Z1000010(){
        super("Z1000010","CMG2_SP","Z1000010","12","sprintf","%5.4f","Control Moment Gyroscope (CMG) 2 Wheel Speed (rpm)","Control Moment Gyroscope (CMG) 2 Wheel Speed (rpm). Rotational speed of the CMG-2 flywheel.");
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
