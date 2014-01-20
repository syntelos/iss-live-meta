package schema;

public class USLAB000009
    extends Schematic
{

    public USLAB000009(){
        super("USLAB000009","ACMG_MOM","Nms","12","sprintf","%5.4f","Active Control Moment Gyroscope (CMG) Momentum (Nms)","Active Control Moment Gyroscope (CMG) Momentum (Nms). The magnitude of the cumulative momentum vector produced by the on-line CMGs. Momentum increases as the CMGs exert a torque in a single direction over a period of time.");
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
