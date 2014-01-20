package schema;

public class USLAB000082
    extends Schematic
{

    public USLAB000082(){
        super("USLAB000082","STCC","USLAB000082","12","sprintf","%5.4f","Standard Command Counter - Count of standard commands received by the ISS Command and Control Computer","Standard Command Counter - Count of standard commands received by the ISS Command and Control Computer");
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
