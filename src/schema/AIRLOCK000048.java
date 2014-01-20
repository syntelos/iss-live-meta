package schema;

public class AIRLOCK000048
    extends Schematic
{

    public AIRLOCK000048(){
        super("AIRLOCK000048","ARL_PUMP_SW","AIRLOCK000048","64","enum","0=PUMP OFF CMD|1=PUMP ON CMD","Pumps atmosphere from Airlock into Node one during depress, switch status.","Pumps atmosphere from Airlock into Node one during depress, switch status.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "PUMP OFF CMD";
            case 1:
                return "PUMP ON CMD";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
