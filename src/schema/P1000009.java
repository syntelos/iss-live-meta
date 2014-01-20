package schema;

public class P1000009
    extends Schematic
{

    public P1000009(){
        super("P1000009","P1_MDM2","P1000009","64","enum","0=Off|1=On|3=Failed","P1 Truss Multiplexer/Demultiplexer (MDM) 2 on-off status","P1 Truss Multiplexer/Demultiplexer (MDM) 2 on-off status");
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
