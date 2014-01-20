package schema;

public class S1000005
    extends Schematic
{

    public S1000005(){
        super("S1000005","RFG1_EL","S1000005","12","sprintf","%5.4f","S-Band Radio Frequency Group (RFG 1) Elevation Gimbal Position","S-Band Radio Frequency Group (RFG 1) Elevation Gimbal Position");
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
