package schema;

public class USLAB000055
    extends Schematic
{

    public USLAB000055(){
        super("USLAB000055","LAB_PPCO2","torr","12","sprintf","%5.4f","Lab ppCO2","Lab ppCO2. Carbon dioxide level measured by Lab Sensors.");
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
