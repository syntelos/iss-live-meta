package schema;

public class P6000006
    extends Schematic
{

    public P6000006(){
        super("P6000006","P6_PVCU_2B_MDM1","event","64","enum","0=Not Enabled|1=Enabled","Photovolatic Control Unit (PVCU) - Solar Array - 2B Multiplexer/Demultiplexer (MDM) 120 Volt On-Off Status","Photovolatic Control Unit (PVCU) - Solar Array - 2B Multiplexer/Demultiplexer (MDM) 120 Volt On-Off Status");
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
