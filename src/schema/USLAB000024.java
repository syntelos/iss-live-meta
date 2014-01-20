package schema;

public class USLAB000024
    extends Schematic
{

    public USLAB000024(){
        super("USLAB000024","ATT_Y_E","degrees","12","sprintf","%5.4f","US Attitude Yaw Error (deg)","US Attitude Yaw Error (deg). The error between the current and commanded ISS orientation in the yaw axis.");
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
