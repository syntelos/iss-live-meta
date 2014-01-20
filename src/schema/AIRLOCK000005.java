package schema;

public class AIRLOCK000005
    extends Schematic
{

    public AIRLOCK000005(){
        super("AIRLOCK000005","ARL_IRU_V","AIRLOCK000005","12","sprintf","%5.4f","In-flight Refill Unit (IRU), Voltage","Supplies power through the Umbilical Interface Assembly (UIA) to the spacesuits (EMU s) and the In-flight Refill Unit (IRU).");
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
