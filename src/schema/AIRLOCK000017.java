package schema;

public class AIRLOCK000017
    extends Schematic
{

    public AIRLOCK000017(){
        super("AIRLOCK000017","ARL_BCA4_V","volts","12","sprintf","%5.4f","Battery Charger Assembly (BCA) 4 Voltage","Battery Charger Assembly (BCA) 4 Voltage");
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
