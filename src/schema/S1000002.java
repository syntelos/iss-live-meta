package schema;

public class S1000002
    extends Schematic
{

    public S1000002(){
        super("S1000002","S1_A_PRES","kPa","12","sprintf","%5.4f","Loop A PM Out Press (kPa)","Loop A PM Out Press (kPa) Pressure of Ammonia coming out of the pump");
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
