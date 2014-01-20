package schema;

public class USLAB000072
    extends Schematic
{

    public USLAB000072(){
        super("USLAB000072","PL_MDM2","event","64","enum","0=Off|1=On|3=Failed","Payload (PL) Multiplexer/Demultiplexer (MDM) 2 on-off status","Payload (PL) Multiplexer/Demultiplexer (MDM) 2 on-off status");
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
