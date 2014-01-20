package schema;

public class S0000011
    extends Schematic
{

    public S0000011(){
        super("S0000011","S0_MDM1","S0000011","64","enum","0=Off|1=On|3=Failed","S0 Truss Multiplexer/Demultiplexer (MDM) 1 on-off status","S0 Truss Multiplexer/Demultiplexer (MDM) 1 on-off status");
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
