package schema;

public class NODE3000013
    extends Schematic
{

    public NODE3000013(){
        super("NODE3000013","N3_AC_TEMP","NODE3000013","12","sprintf","%5.4f","Air Cooling Fluid Temp (Node 3)","Air Cooling Fluid Temp (Node 3). Temperature of the water loop cooling the air in Node 3.");
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
