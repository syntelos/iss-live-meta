package schema;

public class USLAB000069
    extends Schematic
{

    public USLAB000069(){
        super("USLAB000069","ICZ_MDM1","USLAB000069","64","enum","0=Off|1=On|3=Failed","Internal Control Zone Multiplexer/Demultiplexer (MDM) 1 on-off status","Internal Control Zone Multiplexer/Demultiplexer (MDM) 1 on-off status");
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
