package schema;

public class USLAB000038
    extends Schematic
{

    public USLAB000038(){
        super("USLAB000038","CMG_MOM_CAP","USLAB000038","12","sprintf","%5.4f","Active Control Moment Gyroscope (CMG) Momentum Capacity (Nms)","Active Control Moment Gyroscope (CMG) Momentum Capacity (Nms)");
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
