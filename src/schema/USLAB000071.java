package schema;

public class USLAB000071
    extends Schematic
{

    public USLAB000071(){
        super("USLAB000071","PL_MDM1","USLAB000071","64","enum","0=Off|1=On|3=Failed","Payload (PL) Multiplexer/Demultiplexer (MDM) 1 on-off status","Payload (PL) Multiplexer/Demultiplexer (MDM) 1 on-off status");
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
