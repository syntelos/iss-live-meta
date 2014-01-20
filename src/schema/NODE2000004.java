package schema;

public class NODE2000004
    extends Schematic
{

    public NODE2000004(){
        super("NODE2000004","N2_MDM2","NODE2000004","64","enum","0=Off|1=On|3=Failed","Node 2 Multiplexer/Demultiplexer (MDM) 2 on-off status","Node 2 Multiplexer/Demultiplexer (MDM) 2 on-off status");
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
