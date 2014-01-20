package schema;

public class S0000002
    extends Schematic
{

    public S0000002(){
        super("S0000002","S0_TRRJ_P","S0000002","64","enum","115","Port Thermal Radiator Rotating Joint (TRRJ) Position (degrees)","Port Thermal Radiator Rotating Joint (TRRJ) Position (degrees) Zero degrees is");
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
