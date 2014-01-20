package schema;

public class USLAB000020
    extends Schematic
{

    public USLAB000020(){
        super("USLAB000020","LVLH2","USLAB000020","12","sprintf","%5.4f","US Current Local Vertical Local Horizontal (LVLH) Attitude Quaternion Component 2","US Current Local Vertical Local Horizontal (LVLH) Attitude Quaternion Component 2");
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
