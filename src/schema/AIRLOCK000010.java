package schema;

public class AIRLOCK000010
    extends Schematic
{

    public AIRLOCK000010(){
        super("AIRLOCK000010","ARL_EMU2_I","AIRLOCK000010","12","sprintf","%5.4f","Supplies power to the spacesuits (EVA Mobility Unit, EMU 2), Current","Supplies power to the spacesuits (EVA Mobility Unit = EMU s).");
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
