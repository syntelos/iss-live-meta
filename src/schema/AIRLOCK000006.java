package schema;

public class AIRLOCK000006
    extends Schematic
{

    public AIRLOCK000006(){
        super("AIRLOCK000006","ARL_IRU_I","AIRLOCK000006","12","sprintf","%5.4f","In-flight Refill Unit (IRU), Current","Supplies power through the Umbilical Interface Assembly (UIA) to the spacesuits (EMU s) and the In-flight Refill Unit (IRU).");
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
