package schema;

public class AIRLOCK000058
    extends Schematic
{

    public AIRLOCK000058(){
        super("AIRLOCK000058","ARL_MDM","event","64","enum","0=Off|1=On|3=Failed","Airlock Multiplexer/Demultiplexer (MDM) on-off status","Airlock Multiplexer/Demultiplexer (MDM) on-off status");
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
