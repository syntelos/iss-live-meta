package schema;

public class S0000010
    extends Schematic
{

    public S0000010(){
        super("S0000010","S0_ECZ_MDM1","S0000010","64","enum","0=Off|1=On|3=Failed","External Control Zone Multiplexer/Demultiplexer (MDM) 1 on-off status","External Control Zone Multiplexer/Demultiplexer (MDM) 1 on-off status");
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
