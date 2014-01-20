package schema;

public class Z1000004
    extends Schematic
{

    public Z1000004(){
        super("Z1000004","CMG4_VIBR","Z1000004","12","sprintf","%5.4f","Control Moment Gyroscope (CMG)-4 Vibration (g)","Control Moment Gyroscope (CMG)-4 Vibration (g). CMG-4 vibration sensor output. Measures vibration of the Inner Gimbal (IG). Used as an indicator of a possible spin bearing failure.");
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
