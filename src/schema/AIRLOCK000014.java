package schema;

public class AIRLOCK000014
    extends Schematic
{

    public AIRLOCK000014(){
        super("AIRLOCK000014","ARL_BCA2_I","AIRLOCK000014","12","sprintf","%5.4f","Battery Charger Assembly (BCA) 2 Current","Battery Charger Assembly (BCA) 2 Current");
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
