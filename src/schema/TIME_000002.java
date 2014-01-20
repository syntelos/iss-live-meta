package schema;

public class TIME_000002
    extends Schematic
{

    public TIME_000002(){
        super("TIME_000002","YEAR","years","12","sprintf","%4.0f","Year","Year");
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
