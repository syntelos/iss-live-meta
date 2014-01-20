package schema;

public class USLAB000080
    extends Schematic
{

    public USLAB000080(){
        super("USLAB000080","PMM_PWR","USLAB000080","64","enum","0=Off|1=On|3=Failed","Permanent Multipurpose Module - System Power voltage status","Permanent Multipurpose Module - System Power voltage status");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "Off";
            case 1:
                return "On";
            case 3:
                return "Failed";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
