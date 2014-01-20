package schema;

public class NODE3000016
    extends Schematic
{

    public NODE3000016(){
        super("NODE3000016","HCZ_MDM1","NODE3000016","64","enum","0=Off|1=On|3=Failed","Hub Control Zone (HCZ) Multiplexer/Demultiplexer 1 (MDM) on-off status","Hub Control Zone (HCZ) Multiplexer/Demultiplexer 1 (MDM) on-off status");
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
