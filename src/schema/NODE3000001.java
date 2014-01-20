package schema;

public class NODE3000001
    extends Schematic
{

    public NODE3000001(){
        super("NODE3000001","N3_PPO2","torr","12","sprintf","%5.4f","Node 3 ppO2","Node 3 ppO2. Oxygen level measured by Node 3 Sensors");
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
