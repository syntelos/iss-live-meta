package schema;

public class USLAB000063
    extends Schematic
{

    public USLAB000063(){
        super("USLAB000063","LAB_VAC_EX","position","12","sprintf","%5.4f","Vacuum Exhaust System Valve Position","Vacuum Exhaust System Valve Position. Position of the Vacuum Exhaust System s overboard vent valve.");
    }


    public Object parse(String string){
        try {
            return new Float(string);
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
