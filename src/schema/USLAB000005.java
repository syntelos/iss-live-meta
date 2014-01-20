package schema;

public class USLAB000005
    extends Schematic
{

    public USLAB000005(){
        super("USLAB000005","CMG","USLAB000005","12","sprintf","%5.4f","Number of Control Moment Gyroscope (CMG)s Online","Number of Control Moment Gyroscope (CMG)s Online. The number of Control Moment Gyros (CMGs) that are currently on-line.");
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
