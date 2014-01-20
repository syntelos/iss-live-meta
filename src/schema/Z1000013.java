package schema;

public class Z1000013
    extends Schematic
{

    public Z1000013(){
        super("Z1000013","KU_TRANS","event","64","enum","0=RESET|1=NORMAL","Ku-Band Transmit","Ku-Band Transmit");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "RESET";
            case 1:
                return "NORMAL";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
