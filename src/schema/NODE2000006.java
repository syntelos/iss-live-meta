package schema;

public class NODE2000006
    extends Schematic
{

    public NODE2000006(){
        super("NODE2000006","N2_AC_TEMP","NODE2000006","12","sprintf","%5.4f","Air Cooling Fluid Temp (Node 2)","Air Cooling Fluid Temp (Node 2). Temperature of the water loop cooling the air in Node 2.");
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
