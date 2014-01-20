package schema;

public class AIRLOCK000054
    extends Schematic
{

    public AIRLOCK000054(){
        super("AIRLOCK000054","ARL_PRES_EQUIP","AIRLOCK000054","12","sprintf","%5.4f","Airlock Pressure","Airlock Pressure. Cabin pressure in the equipment lock.");
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
