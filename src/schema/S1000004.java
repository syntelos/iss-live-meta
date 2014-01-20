package schema;

public class S1000004
    extends Schematic
{

    public S1000004(){
        super("S1000004","RFG1_AZ","S1000004","12","sprintf","%5.4f","S-Band Radio Frequency Group (RFG 1) Azimuth Gimbal Position","S-Band Radio Frequency Group (RFG 1) Azimuth Gimbal Position");
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
