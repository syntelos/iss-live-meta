package schema;

public class USLAB000089
    extends Schematic
{

    public USLAB000089(){
        super("USLAB000089","KUV_DL2","USLAB000089","64","enum","0=INACTIVE|1=ACTIVE","Ku-Band Video Downlink Channel 2 Activity","Ku-Band Video Downlink Channel 2 Activity");
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
