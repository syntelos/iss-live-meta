package schema;

public class Z1000015
    extends Schematic
{

    public Z1000015(){
        super("Z1000015","SGANT_CEL","degrees","12","sprintf","%5.4f","Ku-Band SGANT Cross-Elevation Position","Ku-Band SGANT Cross-Elevation Position");
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
