package schema;

public class AIRLOCK000020
    extends Schematic
{

    public AIRLOCK000020(){
        super("AIRLOCK000020","ARL_BCA2","event","64","enum","0=Normal|1=No Data|2=Missing  Data|3=Extra Data","Battery Charger Assembly (BCA) 2 Status","Battery Charger Assembly (BCA) 2 Status");
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
