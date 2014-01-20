package schema;

public class P1000002
    extends Schematic
{

    public P1000002(){
        super("P1000002","P1_B_PRES","kPa","12","sprintf","%5.4f","Loop B PM Out Press (kPa)","Loop B PM Out Press (kPa) Pressure of Ammonia coming out of the pump.");
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
