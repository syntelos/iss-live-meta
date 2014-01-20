package schema;

public class USLAB000031
    extends Schematic
{

    public USLAB000031(){
        super("USLAB000031","ATT_CMD_Q3","quaternion","12","sprintf","%5.4f","US Commanded Attitude Quaternion Component 3","US Commanded Attitude Quaternion Component 3");
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
