package schema;

public class AIRLOCK000053
    extends Schematic
{

    public AIRLOCK000053(){
        super("AIRLOCK000053","ARL_AC","event","64","enum","0=RESET|1=DRAIN|2=DRYOUT|3=EIB OFF|4=OFF|5=ON|6=STARTUP|7=TEST","Airlock Air Conditioner State","Airlock Air Conditioner State. Status of the Airlock Air Conditioner/Fan.");
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
