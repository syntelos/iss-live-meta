package schema;

public class P1000007
    extends Schematic
{

    public P1000007(){
        super("P1000007","RFG2_STAT","event","64","enum","0=Off|1=On|3=Failed","S-Band Radio Frequency Group (RFG 2), on-off status","S-Band Radio Frequency Group (RFG 2), on-off status");
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
