package schema;

public class P1000004
    extends Schematic
{

    public P1000004(){
        super("P1000004","RFG2_AZ","degrees","12","sprintf","%5.4f","S-Band Radio Frequency Group (RFG 2) Azimuth Gimbal Position","S-Band Radio Frequency Group (RFG 2) Azimuth Gimbal Position");
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
