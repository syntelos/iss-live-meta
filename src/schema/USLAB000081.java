package schema;

public class USLAB000081
    extends Schematic
{

    public USLAB000081(){
        super("USLAB000081","AMIP","event","64","enum","0=FALSE|1=TRUE","Attitude Maneuver In Progress status","Attitude Maneuver In Progress status");
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
