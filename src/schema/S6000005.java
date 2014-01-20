package schema;

public class S6000005
    extends Schematic
{

    public S6000005(){
        super("S6000005","S6_PVCU_1B_I","amperes","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 1B - Drive Current","Photovolatic Control Unit (PVCU) - Solar Array - 1B - Drive Current");
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
