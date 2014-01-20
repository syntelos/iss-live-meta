package schema;

public class NODE2000002
    extends Schematic
{

    public NODE2000002(){
        super("NODE2000002","N2_LTL","kg","12","sprintf","%5.4f","Coolant water quantity (Node 2), LT","Coolant water quantity (Node 2), LT. N2 Low Temperature Loop (LTL) water level.");
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
