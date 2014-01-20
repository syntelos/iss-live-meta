package schema;

public class P1000005
    extends Schematic
{

    public P1000005(){
        super("P1000005","RFG2_EL","degrees","12","sprintf","%5.4f","S-Band Radio Frequency Group (RFG 2) Elevation Gimbal Position","S-Band Radio Frequency Group (RFG 2) Elevation Gimbal Position");
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
