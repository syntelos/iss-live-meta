package schema;

public class P6000005
    extends Schematic
{

    public P6000005(){
        super("P6000005","P6_PVCU_2B_I","P6000005","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 2B - Drive Current","Photovolatic Control Unit (PVCU) - Solar Array - 2B - Drive Current");
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
