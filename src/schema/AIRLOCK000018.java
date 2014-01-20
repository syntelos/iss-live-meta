package schema;

public class AIRLOCK000018
    extends Schematic
{

    public AIRLOCK000018(){
        super("AIRLOCK000018","ARL_BCA4_I","AIRLOCK000018","12","sprintf","%5.4f","Battery Charger Assembly (BCA) 4 Current","Battery Charger Assembly (BCA) 4 Current");
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
