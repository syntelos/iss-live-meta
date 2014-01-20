package schema;

public class USLAB000010
    extends Schematic
{

    public USLAB000010(){
        super("USLAB000010","CMG_MOM_PC","USLAB000010","12","sprintf","%5.4f","Control Moment Gyroscope (CMG) Momentum Percentage (%)","Control Moment Gyroscope (CMG) Momentum Percentage (%). Percentage of the total CMG momentum capacity currently utilized by GNC software.  This parameter provides insight to the amount of margin remaining for maintaining US attitude control.");
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
