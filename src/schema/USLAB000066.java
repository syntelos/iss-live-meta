package schema;

public class USLAB000066
    extends Schematic
{

    public USLAB000066(){
        super("USLAB000066","CNC_MDM1","event","64","enum","0=Off|1=On|3=Failed","Command and Control (C&C) Multiplexer/Demultiplexer (MDM) 1 on-off status","Command and Control (C&C) Multiplexer/Demultiplexer (MDM) 1 on-off status");
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
