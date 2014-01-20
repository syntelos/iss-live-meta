package schema;

public class AIRLOCK000013
    extends Schematic
{

    public AIRLOCK000013(){
        super("AIRLOCK000013","ARL_BCA2_V","AIRLOCK000013","12","sprintf","%5.4f","Battery Charger Assembly (BCA) 2 Voltage","Battery Charger Assembly (BCA) 2 Voltage");
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
