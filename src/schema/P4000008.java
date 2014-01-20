package schema;

public class P4000008
    extends Schematic
{

    public P4000008(){
        super("P4000008","P4_PVCU_4A_BGA","P4000008","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 4A - Beta Gimble Assembly (BGA) Position (degrees)","Photovolatic Control Unit (PVCU) - Solar Array - 4A - Beta Gimble Assembly (BGA) Position (degrees) 0 degrees points inboard");
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
