package schema;

public class NODE3000004
    extends Schematic
{

    public NODE3000004(){
        super("NODE3000004","N3_URN_PROC","NODE3000004","64","enum","2=STOP|4=SHUTDOWN|8=MAINTENANCE|16=NORMAL|32=STANDBY|64=IDLE|128=SYSTEM INITIALIZED","Urine Processor State","Urine Processor State. Status of the Urine Processor.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 2:
                return "STOP";
            case 4:
                return "SHUTDOWN";
            case 8:
                return "MAINTENANCE";
            case 16:
                return "NORMAL";
            case 32:
                return "STANDBY";
            case 64:
                return "IDLE";
            case 128:
                return "SYSTEM INITIALIZED";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
