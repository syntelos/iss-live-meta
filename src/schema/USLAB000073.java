package schema;

public class USLAB000073
    extends Schematic
{

    public USLAB000073(){
        super("USLAB000073","GNC_MDM1","event","64","enum","0=Off|1=On|3=Failed","Guidance, Navigation and Control (GNC) Multiplexer/Demultiplexer 1 on-off status","Guidance, Navigation and Control (GNC) Multiplexer/Demultiplexer 1 on-off status");
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
