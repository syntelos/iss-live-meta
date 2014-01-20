package schema;

public class P6000008
    extends Schematic
{

    public P6000008(){
        super("P6000008","P6_PVCU_2B_BGA","P6000008","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 2B - Beta Gimble Assembly (BGA) Position (degrees)","Photovolatic Control Unit (PVCU) - Solar Array - 2B - Beta Gimble Assembly (BGA) Position (degrees) 0 degrees points inboard");
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
