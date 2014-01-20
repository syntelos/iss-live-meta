package schema;

public class USLAB000102
    extends Schematic
{

    public USLAB000102(){
        super("USLAB000102","SV_DT","seconds","12","sprintf","%sgT","State vector time tag","State vector time tag. Time used to define the ISS state vector.");
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
