package schema;

public class S0000001
    extends Schematic
{

    public S0000001(){
        super("S0000001","S0_TRRJ_S","degrees","12","sprintf","%5.4f","Starboard Thermal Radiator Rotating Joint (TRRJ) Position (degrees)","Starboard Thermal Radiator Rotating Joint (TRRJ) Position (degrees)");
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
