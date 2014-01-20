package schema;

public class NODE3000003
    extends Schematic
{

    public NODE3000003(){
        super("NODE3000003","N3_PPCO2","NODE3000003","12","sprintf","%5.4f","Node 3 ppCO2","Node 3 ppCO2. Carbon dioxide level measured by Node 3 Sensors.");
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
