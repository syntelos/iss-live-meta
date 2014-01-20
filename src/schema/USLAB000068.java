package schema;

public class USLAB000068
    extends Schematic
{

    public USLAB000068(){
        super("USLAB000068","CNC_MDM3","USLAB000068","64","enum","0=Off|1=On|3=Failed","Command and Control (C&C) Multiplexer/Demultiplexer (MDM) 3 on-off status","Command and Control (C&C) Multiplexer/Demultiplexer (MDM) 3 on-off status");
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
