package schema;

public class USLAB000060
    extends Schematic
{

    public USLAB000060(){
        super("USLAB000060","LAB_AV_TEMP","USLAB000060","12","sprintf","%5.4f","Avionics Cooling Fluid Temp (Lab)","Avionics Cooling Fluid Temp (Lab). Temperature of the water loop cooling the avionics in the Lab.");
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
