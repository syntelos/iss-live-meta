package schema;

public class P1000006
    extends Schematic
{

    public P1000006(){
        super("P1000006","P1_MDM1","P1000006","64","enum","0=Off|1=On|3=Failed","P1 Truss Multiplexer/Demultiplexer (MDM) 1 on-off status","P1 Truss Multiplexer/Demultiplexer (MDM) 1 on-off status");
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
