package schema;

public class S4000004
    extends Schematic
{

    public S4000004(){
        super("S4000004","S4_PVCU_3A_V","S4000004","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 3A - Drive Voltage","Photovolatic Control Unit (PVCU) - Solar Array - 3A - Drive Voltage");
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
