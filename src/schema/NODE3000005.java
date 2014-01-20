package schema;

public class NODE3000005
    extends Schematic
{

    public NODE3000005(){
        super("NODE3000005","N3_URN_TANK","kg","12","sprintf","%5.4f","Urine Tank Qty","Urine Tank Qty. Amount of urine available to be processed.");
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
