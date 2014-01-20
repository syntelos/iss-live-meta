package schema;

public class USLAB000053
    extends Schematic
{

    public USLAB000053(){
        super("USLAB000053","LAB_PPO2","torr","12","sprintf","%5.4f","Lab ppO2","Lab ppO2. Oxygen level measured by Lab Sensors.");
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
