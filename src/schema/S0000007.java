package schema;

public class S0000007
    extends Schematic
{

    public S0000007(){
        super("S0000007","S0_TRRJ_A_M","S0000007","64","enum","1=STANDBY|2=RESTART|3=CHECKOUT|4=DIRECTED_POSITION|5=AUTOTRACK|6=BLIND|7=SHUTDOWN|8=SWITCHOVER","External Thermal Control System (ETCS) - Thermal Radiator Rotating Joint (TRRJ) - Loop A - Software mode","External Thermal Control System (ETCS) - Thermal Radiator Rotating Joint (TRRJ) - Loop A - Software mode");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 1:
                return "STANDBY";
            case 2:
                return "RESTART";
            case 3:
                return "CHECKOUT";
            case 4:
                return "DIRECTED_POSITION";
            case 5:
                return "AUTOTRACK";
            case 6:
                return "BLIND";
            case 7:
                return "SHUTDOWN";
            case 8:
                return "SWITCHOVER";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}