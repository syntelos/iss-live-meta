package schema;

public class AIRLOCK000055
    extends Schematic
{

    public AIRLOCK000055(){
        super("AIRLOCK000055","ARL_HIPO2_PRES","AIRLOCK000055","12","sprintf","%5.4f","Airlock Hi P O2 Tank Pressure","Airlock Hi P O2 Tank Pressure. Pressure in the oxygen tank used to support EVA.");
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
