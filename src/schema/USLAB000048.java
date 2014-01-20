package schema;

public class USLAB000048
    extends Schematic
{

    public USLAB000048(){
        super("USLAB000048","CMG4_SMSB_TEMP","celcius","12","sprintf","%5.4f","Spin Motor Spin Bearing Temperature - Control Moment Gyroscope (CMG) 4 (deg C)","Spin Motor Spin Bearing Temperature - Control Moment Gyroscope (CMG) 4 (deg C). Temperature measured on the motor side of the CMG 4 flywheel spin bearing.");
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
