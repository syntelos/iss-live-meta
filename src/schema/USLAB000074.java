package schema;

public class USLAB000074
    extends Schematic
{

    public USLAB000074(){
        super("USLAB000074","GNC_MDM2","USLAB000074","64","enum","0=Off|1=On|3=Failed","Guidance, Navigation and Control (GNC) Multiplexer/Demultiplexer 2 on-off status","Guidance, Navigation and Control (GNC) Multiplexer/Demultiplexer 2 on-off status");
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
