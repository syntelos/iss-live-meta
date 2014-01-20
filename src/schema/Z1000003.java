package schema;

public class Z1000003
    extends Schematic
{

    public Z1000003(){
        super("Z1000003","CMG3_VIBR","Z1000003","12","sprintf","%5.4f","Control Moment Gyroscope (CMG)-3 Vibration (g)","Control Moment Gyroscope (CMG)-3 Vibration (g). CMG-3 vibration sensor output. Measures vibration of the Inner Gimbal (IG). Used as an indicator of a possible spin bearing failure.");
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
