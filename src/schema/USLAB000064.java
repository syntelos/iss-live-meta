package schema;

public class USLAB000064
    extends Schematic
{

    public USLAB000064(){
        super("USLAB000064","LAB_AC_P","USLAB000064","64","enum","0=RESET|1=DRAIN|2=DRYOUT|3=EIB OFF|4=OFF|5=ON|6=STARTUP|7=TEST","Lab Port Air Conditioner State","Lab Port Air Conditioner State. Status of the Lab s Port Air Coditioner/Fan.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "RESET";
            case 1:
                return "DRAIN";
            case 2:
                return "DRYOUT";
            case 3:
                return "EIB OFF";
            case 4:
                return "OFF";
            case 5:
                return "ON";
            case 6:
                return "STARTUP";
            case 7:
                return "TEST";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
