package schema;

public class NODE3000020
    extends Schematic
{

    public NODE3000020(){
        super("NODE3000020","N3_MDM1","event","64","enum","0=Off|1=On|3=Failed","Node 3 Multiplexer/Demultiplexer (MDM) 1 on-off status","Node 3 Multiplexer/Demultiplexer (MDM) 1 on-off status");
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
