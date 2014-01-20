package schema;

public class USLAB000087
    extends Schematic
{

    public USLAB000087(){
        super("USLAB000087","PCS_CON","quantity","12","sprintf","%5.4f","PCS Connection Count - Number of crew Portable Computer System laptops active and connected to the Primary Command and Control (C&C) Multiplexer/Demultiplexer (MDM)","PCS Connection Count - Number of crew Portable Computer System laptops active and connected to the Primary Command and Control (C&C) Multiplexer/Demultiplexer (MDM)");
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
