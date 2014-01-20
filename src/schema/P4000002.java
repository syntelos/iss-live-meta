package schema;

public class P4000002
    extends Schematic
{

    public P4000002(){
        super("P4000002","P4_PVCU_2A_I","amperes","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 2A - Drive Current","Photovolatic Control Unit (PVCU) - Solar Array - 2A - Drive Current");
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
