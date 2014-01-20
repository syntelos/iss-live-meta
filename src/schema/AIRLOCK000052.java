package schema;

public class AIRLOCK000052
    extends Schematic
{

    public AIRLOCK000052(){
        super("AIRLOCK000052","ARL_N2","AIRLOCK000052","64","enum","0=CLOSED|1=OPEN|2=IN-TRANSIT|3=FAILED","N2 Supply Valve position","N2 Supply Valve position. Position of the valve controlling the ISS nitrogen supply.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "CLOSED";
            case 1:
                return "OPEN";
            case 2:
                return "IN-TRANSIT";
            case 3:
                return "FAILED";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
