package schema;

public class NODE3000019
    extends Schematic
{

    public NODE3000019(){
        super("NODE3000019","N3_LTL","kg","12","sprintf","%5.4f","Coolant water quantity (Node 3)","Coolant water quantity (Node 3). N3 Low Temperature Loop (LTL) water level.");
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
