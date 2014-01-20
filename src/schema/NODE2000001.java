package schema;

public class NODE2000001
    extends Schematic
{

    public NODE2000001(){
        super("NODE2000001","N2_MTL","kg","12","sprintf","%5.4f","Coolant water quantity (Node 2), MT","Coolant water quantity (Node 2), MT. N2 Moderate Temperature Loop (MTL) water level");
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
