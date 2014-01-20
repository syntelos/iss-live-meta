package schema;

public class USLAB000004
    extends Schematic
{

    public USLAB000004(){
        super("USLAB000004","CMG4","event","64","enum","0=NOT IN USE|1=IN USE","Control Moment Gyroscope (CMG)-4 On-Line","Control Moment Gyroscope (CMG)-4 On-Line. Status flag indicating that CMG-4 is in active use for attitude control by the GNC software when the U.S. segment is in active control of the ISS.");
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
