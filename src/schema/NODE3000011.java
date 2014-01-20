package schema;

public class NODE3000011
    extends Schematic
{

    public NODE3000011(){
        super("NODE3000011","N3_O2_PROD","event","64","enum","327.67","O2 Production rate","O2 Production rate. Amount of oxygen being produced if the Oxygen Generator status is");
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
