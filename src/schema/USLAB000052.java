package schema;

public class USLAB000052
    extends Schematic
{

    public USLAB000052(){
        super("USLAB000052","CMG4_HRSB_TEMP","celcius","12","sprintf","%5.4f","Hall Resolver Spin Bearing Temperature - Control Moment Gyroscope (CMG) 4 (deg C)","Hall Resolver Spin Bearing Temperature - Control Moment Gyroscope (CMG) 4 (deg C). Temperature measured on the sensor side of the CMG 4 flywheel spin bearing.");
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
