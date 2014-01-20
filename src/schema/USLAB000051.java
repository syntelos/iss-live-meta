package schema;

public class USLAB000051
    extends Schematic
{

    public USLAB000051(){
        super("USLAB000051","CMG3_HRSB_TEMP","USLAB000051","12","sprintf","%5.4f","Hall Resolver Spin Bearing Temperature - Control Moment Gyroscope (CMG) 3 (deg C)","Hall Resolver Spin Bearing Temperature - Control Moment Gyroscope (CMG) 3 (deg C). Temperature measured on the sensor side of the CMG 3 flywheel spin bearing.");
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
