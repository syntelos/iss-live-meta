package schema;

public class USLAB000085
    extends Schematic
{

    public USLAB000085(){
        super("USLAB000085","CNC_DMD_T_F","USLAB000085","12","sprintf","%5.4f","ISS Command and Control Multiplexer/Demultiplexer Onboard Time (fine)","ISS Command and Control Multiplexer/Demultiplexer Onboard Time (fine)");
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
