package schema;

public class AIRLOCK000002
    extends Schematic
{

    public AIRLOCK000002(){
        super("AIRLOCK000002","ARL_UIA1_I","amperes","12","sprintf","%5.4f","Supplies power through the Umbilical Interface Assembly (UIA) to the spacesuits (EMU 1), Current","Supplies power through the Umbilical Interface Assembly (UIA) to the spacesuits (EMU s) and the In-flight Refill Unit (IRU).");
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
