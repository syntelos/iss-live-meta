package schema;

public class USLAB000062
    extends Schematic
{

    public USLAB000062(){
        super("USLAB000062","LAB_VAC_RS","position","12","sprintf","%5.4f","Vacuum Resource System Valve Position","Vacuum Resource System Valve Position. Position of the Vacuum Resource System s overboard vent valve.");
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
