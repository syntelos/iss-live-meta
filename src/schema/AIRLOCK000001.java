package schema;

public class AIRLOCK000001
    extends Schematic
{

    public AIRLOCK000001(){
        super("AIRLOCK000001","ARL_UIA1_V","AIRLOCK000001","12","sprintf","%5.4f","Supplies power through the Umbilical Interface Assembly (UIA) to the spacesuits (EMU 1), Voltage","Supplies power through the Umbilical Interface Assembly (UIA) to the spacesuits (EMU s) and the In-flight Refill Unit (IRU).");
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
