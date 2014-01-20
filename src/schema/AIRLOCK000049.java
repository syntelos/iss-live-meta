package schema;

public class AIRLOCK000049
    extends Schematic
{

    public AIRLOCK000049(){
        super("AIRLOCK000049","ARL_PRES_CREW","AIRLOCK000049","12","sprintf","%5.4f","Crewlock Pressure","Crewlock Pressure. Cabin pressure in the airlock.");
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
