package schema;

public class USLAB000013
    extends Schematic
{

    public USLAB000013(){
        super("USLAB000013","ATT_SRC","USLAB000013","64","enum","0=NONE|1=GPS1|2=GPS2|3=Russian|4=Ku_Band","US Attitude Source","US Attitude Source. The selected source of attitude updates to the GNC software. Options are GPS 1 or GPS 2 (redundant GPS receivers which calculate attitude using several antenna), Russian (attitude calculated on the Russian Segment), or Ku-Band (attitude calculated using the Ku-Band antenna information as it tracks TDRS communications satellites).");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "NONE";
            case 1:
                return "GPS1";
            case 2:
                return "GPS2";
            case 3:
                return "Russian";
            case 4:
                return "Ku_Band";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
