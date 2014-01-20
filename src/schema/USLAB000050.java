package schema;

public class USLAB000050
    extends Schematic
{

    public USLAB000050(){
        super("USLAB000050","CMG2_HRSB_TEMP","USLAB000050","12","sprintf","%5.4f","Hall Resolver Spin Bearing Temperature - Control Moment Gyroscope (CMG) 2 (deg C)","Hall Resolver Spin Bearing Temperature - Control Moment Gyroscope (CMG) 2 (deg C). Temperature measured on the sensor side of the CMG 2 flywheel spin bearing.");
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
