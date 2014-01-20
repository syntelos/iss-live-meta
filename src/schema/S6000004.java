package schema;

public class S6000004
    extends Schematic
{

    public S6000004(){
        super("S6000004","S6_PVCU_1B_V","S6000004","12","sprintf","%5.4f","Photovolatic Control Unit (PVCU) - Solar Array - 1B - Drive Voltage","Photovolatic Control Unit (PVCU) - Solar Array - 1B - Drive Voltage");
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
