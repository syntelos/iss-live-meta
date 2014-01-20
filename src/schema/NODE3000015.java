package schema;

public class NODE3000015
    extends Schematic
{

    public NODE3000015(){
        super("NODE3000015","N3_MDM2","NODE3000015","64","enum","0=Off|1=On|3=Failed","Node 3 Multiplexer/Demultiplexer (MDM) 2 on-off status","Node 3 Multiplexer/Demultiplexer (MDM) 2 on-off status");
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
