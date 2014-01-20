package schema;

public class USLAB000079
    extends Schematic
{

    public USLAB000079(){
        super("USLAB000079","USLAB_MDM3","event","64","enum","0=Off|1=On|3=Failed","US Lab Multiplexer/Demultiplexer (MDM) 3 on-off status","US Lab Multiplexer/Demultiplexer (MDM) 3 on-off status");
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
