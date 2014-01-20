package schema;

public class USLAB000029
    extends Schematic
{

    public USLAB000029(){
        super("USLAB000029","ATT_CMD_Q1","USLAB000029","12","sprintf","%5.4f","US Commanded Attitude Quaternion Component 1","US Commanded Attitude Quaternion Component 1");
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
