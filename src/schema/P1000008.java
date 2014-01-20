package schema;

public class P1000008
    extends Schematic
{

    public P1000008(){
        super("P1000008","STR_P_MDM","event","64","enum","0=Off|1=On|3=Failed","Port Thermal Radiator (STR) Multiplexer/Demultiplexer (MDM) on-off status","Port Thermal Radiator (STR) Multiplexer/Demultiplexer (MDM) on-off status");
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
