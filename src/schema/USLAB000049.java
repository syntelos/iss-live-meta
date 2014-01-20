package schema;

public class USLAB000049
    extends Schematic
{

    public USLAB000049(){
        super("USLAB000049","CMG1_HRSB_TEMP","USLAB000049","12","sprintf","%5.4f","Hall Resolver Spin Bearing Temperature - Control Moment Gyroscope (CMG) 1 (deg C)","Hall Resolver Spin Bearing Temperature - Control Moment Gyroscope (CMG) 1 (deg C). Temperature measured on the sensor side of the CMG 1 flywheel spin bearing.");
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
