package schema;

public class USLAB000083
    extends Schematic
{

    public USLAB000083(){
        super("USLAB000083","DLCC","quantity","12","sprintf","%5.4f","Data Load Command Counter - Count of data load commands received by the ISS Command and Control Computer","Data Load Command Counter - Count of data load commands received by the ISS Command and Control Computer");
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
