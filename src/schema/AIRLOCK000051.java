package schema;

public class AIRLOCK000051
    extends Schematic
{

    public AIRLOCK000051(){
        super("AIRLOCK000051","ARL_LOPO2","AIRLOCK000051","64","enum","0=CLOSED|1=OPEN|2=IN-TRANSIT|3=FAILED","Lo P O2 Supply Valve position","Lo P O2 Supply Valve position. Position of the valve controlling the ISS oxygen supply.");
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
