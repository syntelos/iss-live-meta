package schema;

public class NODE1000002
    extends Schematic
{

    public NODE1000002(){
        super("NODE1000002","N1_MDM2","event","64","enum","0=Off|1=On|3=Failed","Node 1 Multiplexer/Demultiplexer (MDM) 2 on-off status","Node 1 Multiplexer/Demultiplexer (MDM) 2 on-off status");
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
