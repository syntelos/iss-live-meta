package schema;

public class P4000005
    extends Schematic
{

    public P4000005(){
        super("P4000005","P4_PVCU_4A_I","amperes","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 4A - Drive Current","Photovolatic Control Unit (PVCU) - Solar Array - 4A - Drive Current");
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
