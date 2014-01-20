package schema;

public class S1000003
    extends Schematic
{

    public S1000003(){
        super("S1000003","S1_A_TEMP","S1000003","12","sprintf","%5.4f","Loop A PM Out Temp (deg C)","Loop A PM Out Temp (deg C) Temperature of the ammonia coming out of the pump, before it starts taking on the heat of ISS loads.");
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
