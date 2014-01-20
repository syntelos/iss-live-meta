package schema;

public class USLAB000011
    extends Schematic
{

    public USLAB000011(){
        super("USLAB000011","DESAT_Q","USLAB000011","64","enum","0=ENABLED|1=INHIBITED","Desaturation Request (Enabled/Inhibited)","Desaturation Request (Enabled/Inhibited). Provides status of whether desaturation thruster firings are permitted.  Desaturations help prevent the CMG system from saturation, or 100% momentum percentage, by reducing the active CMG momentum.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "ENABLED";
            case 1:
                return "INHIBITED";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
