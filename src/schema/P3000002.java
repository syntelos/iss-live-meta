package schema;

public class P3000002
    extends Schematic
{

    public P3000002(){
        super("P3000002","P3_MDM2","event","64","enum","0=Off|1=On|3=Failed","P3 Truss Multiplexer/Demultiplexer (MDM) 2 on-off status","P3 Truss Multiplexer/Demultiplexer (MDM) 2 on-off status");
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
