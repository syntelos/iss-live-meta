package schema;

public class NODE1000001
    extends Schematic
{

    public NODE1000001(){
        super("NODE1000001","N1_MDM1","NODE1000001","64","enum","0=Off|1=On|3=Failed","Node 1 Multiplexer/Demultiplexer (MDM) 1 on-off status","Node 1 Multiplexer/Demultiplexer (MDM) 1 on-off status");
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
