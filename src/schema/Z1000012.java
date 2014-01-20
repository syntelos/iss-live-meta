package schema;

public class Z1000012
    extends Schematic
{

    public Z1000012(){
        super("Z1000012","CMG4_SP","Z1000012","12","sprintf","%5.4f","Control Moment Gyroscope (CMG) 4 Wheel Speed (rpm)","Control Moment Gyroscope (CMG) 4 Wheel Speed (rpm). Rotational speed of the CMG-4 flywheel.");
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
