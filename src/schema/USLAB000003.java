package schema;

public class USLAB000003
    extends Schematic
{

    public USLAB000003(){
        super("USLAB000003","CMG3","USLAB000003","64","enum","0=NOT IN USE|1=IN USE","Control Moment Gyroscope (CMG)-3 On-Line","Control Moment Gyroscope (CMG)-3 On-Line. Status flag indicating that CMG-3 is in active use for attitude control by the GNC software when the U.S. segment is in active control of the ISS.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "NOT IN USE";
            case 1:
                return "IN USE";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
