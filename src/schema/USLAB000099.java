package schema;

public class USLAB000099
    extends Schematic
{

    public USLAB000099(){
        super("USLAB000099","STSR1_PWR","event","64","enum","0=Off|1=On|3=Failed","Space-To-Space Radio (UHF) 1 Power","Space-To-Space Radio (UHF) 1 Power");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "Off";
            case 1:
                return "On";
            case 3:
                return "Failed";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
