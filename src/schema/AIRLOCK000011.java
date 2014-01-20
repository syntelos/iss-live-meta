package schema;

public class AIRLOCK000011
    extends Schematic
{

    public AIRLOCK000011(){
        super("AIRLOCK000011","ARL_BCA1_V","AIRLOCK000011","12","sprintf","%5.4f","Battery Charger Assembly (BCA) 1 Voltage","Battery Charger Assembly (BCA) 1 Voltage");
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
