package schema;

public class USLAB000041
    extends Schematic
{

    public USLAB000041(){
        super("USLAB000041","LOAC_CMG","USLAB000041","64","enum","0=FALSE|1=TRUE","Loss of CMG Attitude Control (LOAC) Caution Message In Alarm","Loss of CMG Attitude Control (LOAC) Caution Message In Alarm. Defines when the US GNC has declared the CMGs can no longer maintain attitude control.");
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
