package schema;

public class USLAB000100
    extends Schematic
{

    public USLAB000100(){
        super("USLAB000100","STSR2_PWR","event","64","enum","0=Off|1=On|3=Failed","Space-To-Space Radio (UHF) 2 Power","Space-To-Space Radio (UHF) 2 Power");
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
