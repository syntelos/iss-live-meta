package schema;

public class P1000003
    extends Schematic
{

    public P1000003(){
        super("P1000003","P1_B_TEMP","celcius","12","sprintf","%5.4f","Loop B PM Out Temp (deg C)","Loop B PM Out Temp (deg C) Temperature of the ammonia coming out of the pump, before it starts taking on the heat of ISS loads.");
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
