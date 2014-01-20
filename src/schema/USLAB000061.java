package schema;

public class USLAB000061
    extends Schematic
{

    public USLAB000061(){
        super("USLAB000061","LAB_AC_TEMP","USLAB000061","12","sprintf","%5.4f","Air Cooling Fluid Temp (Lab)","Air Cooling Fluid Temp (Lab). Temperature of the water loop cooling the air in the Lab.");
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
