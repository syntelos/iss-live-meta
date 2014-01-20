package schema;

public class AIRLOCK000007
    extends Schematic
{

    public AIRLOCK000007(){
        super("AIRLOCK000007","ARL_EMU1_V","volts","12","sprintf","%5.4f","Supplies power to the spacesuits (EVA Mobility Unit, EMU 1), Voltage","Supplies power to the spacesuits (EVA Mobility Unit = EMU s).");
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
