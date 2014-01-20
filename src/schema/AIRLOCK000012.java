package schema;

public class AIRLOCK000012
    extends Schematic
{

    public AIRLOCK000012(){
        super("AIRLOCK000012","ARL_BCA1_I","amperes","12","sprintf","%5.4f","Battery Charger Assembly (BCA) 1 Current","Battery Charger Assembly (BCA) 1 Current");
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
