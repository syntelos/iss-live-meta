package schema;

public class S4000005
    extends Schematic
{

    public S4000005(){
        super("S4000005","S4_PVCU_3A_I","amperes","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 3A - Drive Current","Photovolatic Control Unit (PVCU) - Solar Array - 3A - Drive Current");
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
