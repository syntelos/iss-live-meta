package schema;

public class S1000006
    extends Schematic
{

    public S1000006(){
        super("S1000006","STR_S_MDM","S1000006","64","enum","0=Off|1=On|3=Failed","Starboard Thermal Radiator (STR) Multiplexer/Demultiplexer (MDM) on-off status","Starboard Thermal Radiator (STR) Multiplexer/Demultiplexer (MDM) on-off status");
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
