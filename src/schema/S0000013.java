package schema;

public class S0000013
    extends Schematic
{

    public S0000013(){
        super("S0000013","S0_MDM2","S0000013","64","enum","0=Off|1=On|3=Failed","S0 Truss Multiplexer/Demultiplexer (MDM) 2 on-off status","S0 Truss Multiplexer/Demultiplexer (MDM) 2 on-off status");
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
