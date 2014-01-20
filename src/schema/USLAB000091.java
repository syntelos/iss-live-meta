package schema;

public class USLAB000091
    extends Schematic
{

    public USLAB000091(){
        super("USLAB000091","KUV_DL4","event","64","enum","0=INACTIVE|1=ACTIVE","Ku-Band Video Downlink Channel 4 Activity","Ku-Band Video Downlink Channel 4 Activity");
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
