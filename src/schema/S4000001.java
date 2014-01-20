package schema;

public class S4000001
    extends Schematic
{

    public S4000001(){
        super("S4000001","S4_PVCU_1A_V","S4000001","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 1A - Drive Voltage","Photovolatic Control Unit (PVCU) - Solar Array - 1A - Drive Voltage");
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
