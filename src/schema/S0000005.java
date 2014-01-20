package schema;

public class S0000005
    extends Schematic
{

    public S0000005(){
        super("S0000005","S0_SARJ_P_C","S0000005","12","sprintf","%5.4f","Solar Alpha Rotary Joint (SARJ) Port Joint Angle Commanded Position (degrees)","Solar Alpha Rotary Joint (SARJ) Port Joint Angle Commanded Position (degrees)");
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
