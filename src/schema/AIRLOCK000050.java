package schema;

public class AIRLOCK000050
    extends Schematic
{

    public AIRLOCK000050(){
        super("AIRLOCK000050","ARL_HIPO2","AIRLOCK000050","64","enum","0=CLOSED|1=OPEN|2=IN-TRANSIT|3=FAILED","Hi P O2 Supply valve position","Hi P O2 Supply valve position. Position of the valve controlling the ISS oxygen supply for EVA.");
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
