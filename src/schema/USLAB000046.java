package schema;

public class USLAB000046
    extends Schematic
{

    public USLAB000046(){
        super("USLAB000046","CMG2_SMSB_TEMP","USLAB000046","12","sprintf","%5.4f","Spin Motor Spin Bearing Temperature - Control Moment Gyroscope (CMG) 2 (deg C)","Spin Motor Spin Bearing Temperature - Control Moment Gyroscope (CMG) 2 (deg C). Temperature measured on the motor side of the CMG 2 flywheel spin bearing.");
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
