package schema;

public class P6000004
    extends Schematic
{

    public P6000004(){
        super("P6000004","P6_PVCU_2B_V","volts","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 2B - Drive Voltage","Photovolatic Control Unit (PVCU) - Solar Array - 2B - Drive Voltage");
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
