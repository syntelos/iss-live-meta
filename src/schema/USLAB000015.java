package schema;

public class USLAB000015
    extends Schematic
{

    public USLAB000015(){
        super("USLAB000015","SV_SRC","event","64","enum","0=NO_SOURCE|1=GPS1_FILTER|2=GPS2_FILTER|3=RUSSIAN|4=GPS1_DETERMINISTIC|5=GPS2_DETERMINISTIC|6=GROUND","US State Vector Source","US State Vector Source. The selected source of state vector updates to the GNC software. Options are GPS 1 or GPS 2 (redundant GPS receivers), Russian (the state vector calculated on the Russian Segment), or Ground (a state vector calculated based on ground tracking information and uplinked).");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "NO_SOURCE";
            case 1:
                return "GPS1_FILTER";
            case 2:
                return "GPS2_FILTER";
            case 3:
                return "RUSSIAN";
            case 4:
                return "GPS1_DETERMINISTIC";
            case 5:
                return "GPS2_DETERMINISTIC";
            case 6:
                return "GROUND";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
