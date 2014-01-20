package schema;

public class AIRLOCK000015
    extends Schematic
{

    public AIRLOCK000015(){
        super("AIRLOCK000015","ARL_BCA3_V","volts","12","sprintf","%5.4f","Battery Charger Assembly (BCA) 3 Voltage","Battery Charger Assembly (BCA) 3 Voltage");
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
