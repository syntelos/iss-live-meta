package schema;

public class USLAB000047
    extends Schematic
{

    public USLAB000047(){
        super("USLAB000047","CMG3_SMSB_TEMP","celcius","12","sprintf","%5.4f","Spin Motor Spin Bearing Temperature - Control Moment Gyroscope (CMG) 3 (deg C)","Spin Motor Spin Bearing Temperature - Control Moment Gyroscope (CMG) 3 (deg C). Temperature measured on the motor side of the CMG 3 flywheel spin bearing.");
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
