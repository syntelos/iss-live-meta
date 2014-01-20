package schema;

public class NODE3000009
    extends Schematic
{

    public NODE3000009(){
        super("NODE3000009","N3_CLEAN","NODE3000009","12","sprintf","%5.4f","Clean Water Tank Qty","Clean Water Tank Qty. Amount of potable water available.");
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
