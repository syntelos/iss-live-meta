package schema;

public class NODE3000017
    extends Schematic
{

    public NODE3000017(){
        super("NODE3000017","N3_MTL","NODE3000017","12","sprintf","%5.4f","Coolant water quantity (Node 3)","Coolant water quantity (Node 3). N3 Moderate Temperature Loop (MTL) water level");
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
