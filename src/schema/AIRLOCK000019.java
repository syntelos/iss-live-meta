package schema;

public class AIRLOCK000019
    extends Schematic
{

    public AIRLOCK000019(){
        super("AIRLOCK000019","ARL_BCA1","AIRLOCK000019","64","enum","0=Normal|1=No Data|2=Missing  Data|3=Extra Data","Battery Charger Assembly (BCA) 1 Status","Battery Charger Assembly (BCA) 1 Status");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "Normal";
            case 1:
                return "No Data";
            case 2:
                return "Missing  Data";
            case 3:
                return "Extra Data";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
