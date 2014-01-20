package schema;

public class USLAB000001
    extends Schematic
{

    public USLAB000001(){
        super("USLAB000001","CMG1","USLAB000001","64","enum","0=NOT IN USE|1=IN USE","Control Moment Gyroscope (CMG)-1 On-Line","Control Moment Gyroscope (CMG)-1 On-Line. Status flag indicating that CMG-1 is in active use for attitude control by the GNC software when the U.S. segment is in active control of the ISS.");
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
