package schema;

public class USLAB000094
    extends Schematic
{

    public USLAB000094(){
        super("USLAB000094","IAC2","event","64","enum","0=Backup|1=Active","Internal Audio Controller (IAC) - IAC-2 Active/Backup Indication","Internal Audio Controller (IAC) - IAC-2 Active/Backup Indication");
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
