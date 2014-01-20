package schema;

public class TIME_000001
    extends Schematic
{

    public TIME_000001(){
        super("TIME_000001","GMT","TIME_000001","12","sprintf","%mT","Greenwich Mean Time (GMT)","Greenwich Mean Time (GMT)");
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
