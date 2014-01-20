package schema;

public class USLAB000070
    extends Schematic
{

    public USLAB000070(){
        super("USLAB000070","ICZ_MDM2","event","64","enum","0=Off|1=On|3=Failed","Internal Control Zone Multiplexer/Demultiplexer (MDM) 2 on-off status","Internal Control Zone Multiplexer/Demultiplexer (MDM) 2 on-off status");
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
