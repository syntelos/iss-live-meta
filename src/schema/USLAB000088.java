package schema;

public class USLAB000088
    extends Schematic
{

    public USLAB000088(){
        super("USLAB000088","KUV_DL1","USLAB000088","64","enum","0=INACTIVE|1=ACTIVE","Ku-Band Video Downlink Channel 1 Activity","Ku-Band Video Downlink Channel 1 Activity");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "INACTIVE";
            case 1:
                return "ACTIVE";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
