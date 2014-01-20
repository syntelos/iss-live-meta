package schema;

public class Z1000014
    extends Schematic
{

    public Z1000014(){
        super("Z1000014","SGANT_EL","degrees","12","sprintf","%5.4f","Ku-Band SGANT Elevation Position","Ku-Band SGANT Elevation Position");
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
