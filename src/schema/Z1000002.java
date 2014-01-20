package schema;

public class Z1000002
    extends Schematic
{

    public Z1000002(){
        super("Z1000002","CMG2_VIBR","g","12","sprintf","%5.4f","Control Moment Gyroscope (CMG)-2 Vibration (g)","Control Moment Gyroscope (CMG)-2 Vibration (g). CMG-2 vibration sensor output. Measures vibration of the Inner Gimbal (IG). Used as an indicator of a possible spin bearing failure.");
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
