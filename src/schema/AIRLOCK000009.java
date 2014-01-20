package schema;

public class AIRLOCK000009
    extends Schematic
{

    public AIRLOCK000009(){
        super("AIRLOCK000009","ARL_EMU2_V","AIRLOCK000009","12","sprintf","%5.4f","Supplies power to the spacesuits (EVA Mobility Unit, EMU 2), Voltage","Supplies power to the spacesuits (EVA Mobility Unit = EMU s).");
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
