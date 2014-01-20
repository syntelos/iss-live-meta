package schema;

public class NODE3000010
    extends Schematic
{

    public NODE3000010(){
        super("NODE3000010","N3_O2_GEN","NODE3000010","64","enum","1=PROCESS|2=STANDBY|3=SHUTDOWN|4=STOP|5=VENT_DOME|6=INERT_DOME|7=FAST_SHUTDOWN|8=N2_PURGE_SHUTDOWN","Oxygen Generator State","Oxygen Generator State. Status of the Oxygen Generator.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 1:
                return "PROCESS";
            case 2:
                return "STANDBY";
            case 3:
                return "SHUTDOWN";
            case 4:
                return "STOP";
            case 5:
                return "VENT_DOME";
            case 6:
                return "INERT_DOME";
            case 7:
                return "FAST_SHUTDOWN";
            case 8:
                return "N2_PURGE_SHUTDOWN";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
