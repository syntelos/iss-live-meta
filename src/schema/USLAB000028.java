package schema;

public class USLAB000028
    extends Schematic
{

    public USLAB000028(){
        super("USLAB000028","ATT_CMD_Q0","USLAB000028","12","sprintf","%5.4f","US Commanded Attitude Quaternion Component 0","US Commanded Attitude Quaternion Component 0");
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
