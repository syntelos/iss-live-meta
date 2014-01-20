package schema;

public class AIRLOCK000056
    extends Schematic
{

    public AIRLOCK000056(){
        super("AIRLOCK000056","ARL_LOPO2_PRES","torr","12","sprintf","%5.4f","Airlock Lo P O2 Tank Pressure","Airlock Lo P O2 Tank Pressure. Pressure in the oxygen tanks.");
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
