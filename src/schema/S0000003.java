package schema;

public class S0000003
    extends Schematic
{

    public S0000003(){
        super("S0000003","S0_SARJ_S","S0000003","12","sprintf","%5.4f","Solar Alpha Rotary Joint (SARJ) Starboard Joint Angle Position (degrees)","Solar Alpha Rotary Joint (SARJ) Starboard Joint Angle Position (degrees) Position of the rotary joint based on the output of the active joint resolver corrected for bias (ADO), or if neither joint resolver is excited the Joint_Position_MAR from SARJ_C.");
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
