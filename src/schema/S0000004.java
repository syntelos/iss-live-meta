package schema;

public class S0000004
    extends Schematic
{

    public S0000004(){
        super("S0000004","S0_SARJ_P","degrees","12","sprintf","%5.4f","Solar Alpha Rotary Joint (SARJ) Port Joint Angle Position (degrees)","Solar Alpha Rotary Joint (SARJ) Port Joint Angle Position (degrees) Position of the rotary joint based on the output of the active joint resolver corrected for bias (ADO), or if neither joint resolver is excited the Joint_Position_MAR from SARJ_C.");
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
