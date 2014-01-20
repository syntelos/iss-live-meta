package schema;

public class S1000001
    extends Schematic
{

    public S1000001(){
        super("S1000001","S1_A_FLOW","kg/hour","12","sprintf","%5.4f","Loop A Pump Flowrate (kg/hr)","Loop A Pump Flowrate (kg/hr) Flow rate of Ammonia being moved by ETCS Pump");
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
