package schema;

public class P6000007
    extends Schematic
{

    public P6000007(){
        super("P6000007","P6_PVCU_4B_BGA","P6000007","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 4B - Beta Gimble Assembly (BGA) Position (degrees)","Photovolatic Control Unit (PVCU) - Solar Array - 4B - Beta Gimble Assembly (BGA) Position (degrees) 0 degrees points inboard");
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
