package schema;

public class AIRLOCK000047
    extends Schematic
{

    public AIRLOCK000047(){
        super("AIRLOCK000047","ARL_PUMP_V","event","64","enum","0=Off|1=On|3=Failed","Pumps atmosphere from Airlock into Node one during depress, voltage status.","Pumps atmosphere from Airlock into Node one during depress, voltage status.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "Off";
            case 1:
                return "On";
            case 3:
                return "Failed";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
