package schema;

public class P1000001
    extends Schematic
{

    public P1000001(){
        super("P1000001","P1_B_FLOW","P1000001","12","sprintf","%5.4f","Loop B Pump Flowrate (kg/hr)","Loop B Pump Flowrate (kg/hr) Flow rate of Ammonia being moved by ETCS Pump");
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
