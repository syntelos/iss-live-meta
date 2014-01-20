package schema;

public class AIRLOCK000057
    extends Schematic
{

    public AIRLOCK000057(){
        super("AIRLOCK000057","ARL_N2_PRES","AIRLOCK000057","12","sprintf","%5.4f","Airlock N2 Tank Pressure","Airlock N2 Tank Pressure. Pressure in the reserve nitrogen tanks.");
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
