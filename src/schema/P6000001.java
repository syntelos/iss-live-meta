package schema;

public class P6000001
    extends Schematic
{

    public P6000001(){
        super("P6000001","P6_PVCU_4B_V","P6000001","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 4B - Drive Voltage","Photovolatic Control Unit (PVCU) - Solar Array - 4B - Drive Voltage");
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
