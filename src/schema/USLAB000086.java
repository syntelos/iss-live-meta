package schema;

public class USLAB000086
    extends Schematic
{

    public USLAB000086(){
        super("USLAB000086","ISS_M","event","64","enum","1=Standard|2=Microgravity|4=Reboost|8=Proximity_Ops|16=External_Ops|32=Survival|64=ASCR|127=all_modes","ISS Station Mode","ISS Station Mode");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 1:
                return "Standard";
            case 2:
                return "Microgravity";
            case 4:
                return "Reboost";
            case 8:
                return "Proximity_Ops";
            case 16:
                return "External_Ops";
            case 32:
                return "Survival";
            case 64:
                return "ASCR";
            case 127:
                return "all_modes";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
