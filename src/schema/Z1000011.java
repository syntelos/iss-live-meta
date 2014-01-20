package schema;

public class Z1000011
    extends Schematic
{

    public Z1000011(){
        super("Z1000011","CMG3_SP","Z1000011","12","sprintf","%5.4f","Control Moment Gyroscope (CMG) 3 Wheel Speed (rpm)","Control Moment Gyroscope (CMG) 3 Wheel Speed (rpm). Rotational speed of the CMG-3 flywheel.");
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
