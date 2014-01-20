package schema;

public class NODE3000006
    extends Schematic
{

    public NODE3000006(){
        super("NODE3000006","N3_H2O_PROC","event","64","enum","1=STOP|2=SHUTDOWN|3=STANDBY|4=PROCESS|5=HOT SERVICE|6=FLUSH|7=WARM SHUTDOWN","Water Processor State","Water Processor State. Status of the Water Processor.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 1:
                return "STOP";
            case 2:
                return "SHUTDOWN";
            case 3:
                return "STANDBY";
            case 4:
                return "PROCESS";
            case 5:
                return "HOT SERVICE";
            case 6:
                return "FLUSH";
            case 7:
                return "WARM SHUTDOWN";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
