package schema;

public class Z1000001
    extends Schematic
{

    public Z1000001(){
        super("Z1000001","CMG1_VIBR","Z1000001","12","sprintf","%5.4f","Control Moment Gyroscope (CMG)-1 Vibration (g)","Control Moment Gyroscope (CMG)-1 Vibration (g). CMG-1 vibration sensor output. Measures vibration of the Inner Gimbal (IG). Used as an indicator of a possible spin bearing failure.");
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
