package schema;

public class AIRLOCK000004
    extends Schematic
{

    public AIRLOCK000004(){
        super("AIRLOCK000004","ARL_UIA2_I","AIRLOCK000004","12","sprintf","%5.4f","Supplies power through the Umbilical Interface Assembly (UIA) to the spacesuits (EMU 2), Current","Supplies power through the Umbilical Interface Assembly (UIA) to the spacesuits (EMU s) and the In-flight Refill Unit (IRU).");
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
