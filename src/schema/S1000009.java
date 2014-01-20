package schema;

public class S1000009
    extends Schematic
{

    public S1000009(){
        super("S1000009","RFG1","S1000009","64","enum","0=Off|1=On|3=Failed","S-Band Radio Frequency Group (RFG 1), on-off status","S-Band Radio Frequency Group (RFG 1), on-off status");
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
