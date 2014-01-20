package schema;

public class USLAB000019
    extends Schematic
{

    public USLAB000019(){
        super("USLAB000019","LVLH1","quaternion","12","sprintf","%5.4f","US Current Local Vertical Local Horizontal (LVLH) Attitude Quaternion Component 1","US Current Local Vertical Local Horizontal (LVLH) Attitude Quaternion Component 1");
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
