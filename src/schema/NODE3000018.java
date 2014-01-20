package schema;

public class NODE3000018
    extends Schematic
{

    public NODE3000018(){
        super("NODE3000018","N3_AC","NODE3000018","64","enum","0=RESET|1=DRAIN|2=DRYOUT|3=EIB OFF|4=OFF|5=ON|6=STARTUP|7=TEST","Node 3 Air Conditioner State","Node 3 Air Conditioner State. Status of the Node 3 Air Conditioner/Fan.");
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
