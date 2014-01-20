package schema;

public class S1000007
    extends Schematic
{

    public S1000007(){
        super("S1000007","S1_MDM1","event","64","enum","0=Off|1=On|3=Failed","S1 Truss Multiplexer/Demultiplexer (MDM) 1 on-off status","S1 Truss Multiplexer/Demultiplexer (MDM) 1 on-off status");
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
