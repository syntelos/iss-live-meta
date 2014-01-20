package schema;

public class S6000006
    extends Schematic
{

    public S6000006(){
        super("S6000006","S6_PVCU_1B_MDM","S6000006","64","enum","0=Not Enabled|1=Enabled","Photovolatic Control Unit (PVCU) - Solar Array - 1B Multiplexer/Demultiplexer (MDM) 120 Volt On-Off Status","Photovolatic Control Unit (PVCU) - Solar Array - 1B Multiplexer/Demultiplexer (MDM) 120 Volt On-Off Status");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "Not Enabled";
            case 1:
                return "Enabled";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
