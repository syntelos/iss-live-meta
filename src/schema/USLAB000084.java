package schema;

public class USLAB000084
    extends Schematic
{

    public USLAB000084(){
        super("USLAB000084","CNC_DMD_T_C","seconds","12","sprintf","%sgT","ISS Command and Control Multiplexer/Demultiplexer Onboard Time (course)","ISS Command and Control Multiplexer/Demultiplexer Onboard Time (course)");
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
