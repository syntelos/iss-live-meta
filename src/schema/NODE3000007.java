package schema;

public class NODE3000007
    extends Schematic
{

    public NODE3000007(){
        super("NODE3000007","N3_H2O_STEP","NODE3000007","64","enum","0=NONE|1=VENT|2=HEATUP|3=PURGE|4=FLOW|5=TEST|6=TEST_SV_1|7=TEST_SV_2|8=SERVICE","Water Processor Step","Water Processor Step. What the Water Processor is doing at this time.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "NONE";
            case 1:
                return "VENT";
            case 2:
                return "HEATUP";
            case 3:
                return "PURGE";
            case 4:
                return "FLOW";
            case 5:
                return "TEST";
            case 6:
                return "TEST_SV_1";
            case 7:
                return "TEST_SV_2";
            case 8:
                return "SERVICE";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
