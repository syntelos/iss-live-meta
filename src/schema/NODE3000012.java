package schema;

public class NODE3000012
    extends Schematic
{

    public NODE3000012(){
        super("NODE3000012","N3_AV_TEMP","NODE3000012","12","sprintf","%5.4f","Avionics Cooling Fluid Temp (Node 3)","Avionics Cooling Fluid Temp (Node 3). Temperature of fluid cooling avionics in the Lab.");
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
