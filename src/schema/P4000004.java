package schema;

public class P4000004
    extends Schematic
{

    public P4000004(){
        super("P4000004","P4_PVCU_4A_V","volts","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 4A - Drive Voltage","Photovolatic Control Unit (PVCU) - Solar Array - 4A - Drive Voltage");
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
