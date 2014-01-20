package schema;

public class P4000003
    extends Schematic
{

    public P4000003(){
        super("P4000003","P4_PVCU_2A_MDM1","P4000003","64","enum","0=Not Enabled|1=Enabled","Photovolatic Control Unit (PVCU) - Solar Array - 2A Multiplexer/Demultiplexer (MDM) 120 Volt On-Off Status","Photovolatic Control Unit (PVCU) - Solar Array - 2A Multiplexer/Demultiplexer (MDM) 120 Volt On-Off Status");
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
