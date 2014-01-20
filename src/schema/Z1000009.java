package schema;

public class Z1000009
    extends Schematic
{

    public Z1000009(){
        super("Z1000009","CMG1_SP","rpm","12","sprintf","%5.4f","Control Moment Gyroscope (CMG) 1 Wheel Speed (rpm)","Control Moment Gyroscope (CMG) 1 Wheel Speed (rpm). Rotational speed of the CMG-1 flywheel.");
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
