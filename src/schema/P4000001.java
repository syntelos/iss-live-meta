package schema;

public class P4000001
    extends Schematic
{

    public P4000001(){
        super("P4000001","P4_PVCU_2A_V","P4000001","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 2A - Drive Voltage","Photovolatic Control Unit (PVCU) - Solar Array - 2A - Drive Voltage");
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
