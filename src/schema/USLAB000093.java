package schema;

public class USLAB000093
    extends Schematic
{

    public USLAB000093(){
        super("USLAB000093","IAC1","USLAB000093","64","enum","0=Backup|1=Active","Internal Audio Controller (IAC) - IAC-1 Active/Backup Indication","Internal Audio Controller (IAC) - IAC-1 Active/Backup Indication");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "Backup";
            case 1:
                return "Active";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
