package schema;

public class S3000002
    extends Schematic
{

    public S3000002(){
        super("S3000002","S3_MDM2","S3000002","64","enum","0=Off|1=On|3=Failed","S3 Truss Multiplexer/Demultiplexer (MDM) 2 on-off status","S3 Truss Multiplexer/Demultiplexer (MDM) 2 on-off status");
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
