package schema;

public class S4000002
    extends Schematic
{

    public S4000002(){
        super("S4000002","S4_PVCU_1A_I","S4000002","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 1A - Drive Current","Photovolatic Control Unit (PVCU) - Solar Array - 1A - Drive Current");
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
