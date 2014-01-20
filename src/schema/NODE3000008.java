package schema;

public class NODE3000008
    extends Schematic
{

    public NODE3000008(){
        super("NODE3000008","N3_WASTE","kg","12","sprintf","%5.4f","Waste Water Tank Qty","Waste Water Tank Qty. Amount of waste water waiting to be processed.");
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
