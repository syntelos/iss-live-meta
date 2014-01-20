package schema;

public class USLAB000018
    extends Schematic
{

    public USLAB000018(){
        super("USLAB000018","LVLH0","quaternion","12","sprintf","%5.4f","US Current Local Vertical Local Horizontal (LVLH) Attitude Quaternion Component 0","US Current Local Vertical Local Horizontal (LVLH) Attitude Quaternion Component 0");
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
