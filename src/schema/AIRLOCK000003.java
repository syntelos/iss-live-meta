package schema;

public class AIRLOCK000003
    extends Schematic
{

    public AIRLOCK000003(){
        super("AIRLOCK000003","ARL_UIA2_V","AIRLOCK000003","12","sprintf","%5.4f","Supplies power through the Umbilical Interface Assembly (UIA) to the spacesuits (EMU 2), Voltage","Supplies power through the Umbilical Interface Assembly (UIA) to the spacesuits (EMU s) and the In-flight Refill Unit (IRU).");
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
