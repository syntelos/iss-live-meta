package schema;

public class USLAB000045
    extends Schematic
{

    public USLAB000045(){
        super("USLAB000045","CMG1_SMSB_TEMP","celcius","12","sprintf","%5.4f","Spin Motor Spin Bearing Temperature - Control Moment Gyroscope (CMG) 1 (deg C)","Spin Motor Spin Bearing Temperature - Control Moment Gyroscope (CMG) 1 (deg C). Temperature measured on the motor side of the CMG 1 flywheel spin bearing.");
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
