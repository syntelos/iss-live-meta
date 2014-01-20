package schema;

public class NODE2000007
    extends Schematic
{

    public NODE2000007(){
        super("NODE2000007","N2_AV_TEMP","NODE2000007","12","sprintf","%5.4f","Avionics Cooling Fluid Temp (Node 2)","Avionics Cooling Fluid Temp (Node 2). Temperature of fluid cooling avionics in Node 2.");
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
