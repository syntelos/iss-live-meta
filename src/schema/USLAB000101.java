package schema;

public class USLAB000101
    extends Schematic
{

    public USLAB000101(){
        super("USLAB000101","STSR_LOCK","USLAB000101","64","enum","0=Frame Sync unlocked|1=Frame Sync locked","Space-To-Space Radio Frame Sync Lock","Space-To-Space Radio Frame Sync Lock");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "Frame Sync unlocked";
            case 1:
                return "Frame Sync locked";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
