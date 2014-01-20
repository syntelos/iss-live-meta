package schema;

public class USLAB000021
    extends Schematic
{

    public USLAB000021(){
        super("USLAB000021","LVLH3","quaternion","12","sprintf","%5.4f","US Current Local Vertical Local Horizontal (LVLH) Attitude Quaternion Component 3","US Current Local Vertical Local Horizontal (LVLH) Attitude Quaternion Component 3");
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
