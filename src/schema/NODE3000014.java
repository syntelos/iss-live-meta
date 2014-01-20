package schema;

public class NODE3000014
    extends Schematic
{

    public NODE3000014(){
        super("NODE3000014","HCZ_MDM2","NODE3000014","64","enum","0=Off|1=On|3=Failed","Hub Control Zone (HCZ) Multiplexer/Demultiplexer 2 (MDM) on-off status","Hub Control Zone (HCZ) Multiplexer/Demultiplexer 2 (MDM) on-off status");
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
