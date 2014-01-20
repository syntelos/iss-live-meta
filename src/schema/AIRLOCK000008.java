package schema;

public class AIRLOCK000008
    extends Schematic
{

    public AIRLOCK000008(){
        super("AIRLOCK000008","ARL_EMU1_I","amperes","12","sprintf","%5.4f","Supplies power to the spacesuits (EVA Mobility Unit, EMU 1), Current","Supplies power to the spacesuits (EVA Mobility Unit = EMU s).");
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
