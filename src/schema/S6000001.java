package schema;

public class S6000001
    extends Schematic
{

    public S6000001(){
        super("S6000001","S6_PVCU_3B_V","S6000001","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 3B - Drive Voltage","Photovolatic Control Unit (PVCU) - Solar Array - 3B - Drive Voltage");
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
