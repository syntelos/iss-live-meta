package schema;

public class P6000002
    extends Schematic
{

    public P6000002(){
        super("P6000002","P6_PVCU_4B_I","P6000002","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 4B - Drive Current","Photovolatic Control Unit (PVCU) - Solar Array - 4B - Drive Current");
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
