package schema;

public class USLAB000042
    extends Schematic
{

    public USLAB000042(){
        super("USLAB000042","LOAC_ISS","USLAB000042","64","enum","0=FALSE|1=TRUE","Loss of ISS Attitude Control (LOAC) Caution Message In Alarm","Loss of ISS Attitude Control (LOAC) Caution Message In Alarm. Defines when the US Segment has declared a loss of ISS attitude control.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "FALSE";
            case 1:
                return "TRUE";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
