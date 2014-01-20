package schema;

public class USLAB000078
    extends Schematic
{

    public USLAB000078(){
        super("USLAB000078","USLAB_MDM2","event","64","enum","0=Off|1=On|3=Failed","US Lab Multiplexer/Demultiplexer (MDM) 2 on-off status","US Lab Multiplexer/Demultiplexer (MDM) 2 on-off status");
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
