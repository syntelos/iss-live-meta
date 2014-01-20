package schema;

public class USLAB000014
    extends Schematic
{

    public USLAB000014(){
        super("USLAB000014","RATE_SRC","event","64","enum","0=NONE|1=RGA1|2=RGA2|3=RUSSIAN","US Rate Source","US Rate Source. The selected source of angular rate data to the GNC software, which is used to propagate attitude between updates. Options are RGA 1 or RGA 2 (redundant rate sensors which calculate rate using ring laser gyroscopes), or Russian (angular rate data calculated on the Russian Segment).");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "NONE";
            case 1:
                return "RGA1";
            case 2:
                return "RGA2";
            case 3:
                return "RUSSIAN";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
