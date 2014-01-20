package schema;

public class AIRLOCK000016
    extends Schematic
{

    public AIRLOCK000016(){
        super("AIRLOCK000016","ARL_BCA3_I","AIRLOCK000016","12","sprintf","%5.4f","Battery Charger Assembly (BCA) 3 Current","Battery Charger Assembly (BCA) 3 Current");
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
