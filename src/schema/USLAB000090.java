package schema;

public class USLAB000090
    extends Schematic
{

    public USLAB000090(){
        super("USLAB000090","KUV_DL3","event","64","enum","0=INACTIVE|1=ACTIVE","Ku-Band Video Downlink Channel 3 Activity","Ku-Band Video Downlink Channel 3 Activity");
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
