package schema;

public class USLAB000067
    extends Schematic
{

    public USLAB000067(){
        super("USLAB000067","CNC_MDM2","USLAB000067","64","enum","0=Off|1=On|3=Failed","Command and Control (C&C) Multiplexer/Demultiplexer (MDM) 2 on-off status","Command and Control (C&C) Multiplexer/Demultiplexer (MDM) 2 on-off status");
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
