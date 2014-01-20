package schema;

public class USLAB000030
    extends Schematic
{

    public USLAB000030(){
        super("USLAB000030","ATT_CMD_Q2","quaternion","12","sprintf","%5.4f","US Commanded Attitude Quaternion Component 2","US Commanded Attitude Quaternion Component 2");
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
