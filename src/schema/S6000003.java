package schema;

public class S6000003
    extends Schematic
{

    public S6000003(){
        super("S6000003","S6_PVCU_3B_MDM","S6000003","64","enum","0=Not Enabled|1=Enabled","Photovolatic Control Unit (PVCU) - Solar Array - 3B Multiplexer/Demultiplexer (MDM) 120 Volt On-Off Status","Photovolatic Control Unit (PVCU) - Solar Array - 3B Multiplexer/Demultiplexer (MDM) 120 Volt On-Off Status");
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
