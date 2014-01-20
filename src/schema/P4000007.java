package schema;

public class P4000007
    extends Schematic
{

    public P4000007(){
        super("P4000007","P4_PVCU_2A_BGA","P4000007","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 2A - Beta Gimble Assembly (BGA) Position (degrees)","Photovolatic Control Unit (PVCU) - Solar Array - 2A - Beta Gimble Assembly (BGA) Position (degrees) 0 degrees points inboard");
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
