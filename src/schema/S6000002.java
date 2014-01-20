package schema;

public class S6000002
    extends Schematic
{

    public S6000002(){
        super("S6000002","S6_PVCU_3B_I","S6000002","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 3B - Drive Current","Photovolatic Control Unit (PVCU) - Solar Array - 3B - Drive Current");
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
