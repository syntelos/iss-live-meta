package schema;

public class S4000007
    extends Schematic
{

    public S4000007(){
        super("S4000007","S4_PVCU_1A_BGA","degrees","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 1A - Beta Gimble Assembly (BGA) Position (degrees)","Photovolatic Control Unit (PVCU) - Solar Array - 1A - Beta Gimble Assembly (BGA) Position (degrees) 0 degrees points inboard");
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
