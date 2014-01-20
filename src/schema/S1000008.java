package schema;

public class S1000008
    extends Schematic
{

    public S1000008(){
        super("S1000008","S1_MDM2","S1000008","64","enum","0=Off|1=On|3=Failed","S1 Truss Multiplexer/Demultiplexer (MDM) 2 on-off status","S1 Truss Multiplexer/Demultiplexer (MDM) 2 on-off status");
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
