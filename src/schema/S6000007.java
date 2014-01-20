package schema;

public class S6000007
    extends Schematic
{

    public S6000007(){
        super("S6000007","S6_PVCU_3B_BGA","S6000007","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 3B - Beta Gimble Assembly (BGA) Position (degrees)","Photovolatic Control Unit (PVCU) - Solar Array - 3B - Beta Gimble Assembly (BGA) Position (degrees) 0 degrees points inboard");
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
