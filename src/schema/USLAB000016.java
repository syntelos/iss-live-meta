package schema;

public class USLAB000016
    extends Schematic
{

    public USLAB000016(){
        super("USLAB000016","ATT_CTL","USLAB000016","64","enum","0=ATTITUDE HOLD|1=MOM MGMT","Attitude Controller Type","Attitude Controller Type. Indicates the type of attitude controller utilized by the US GNC. An Attitude Hold controller is used to minimize error in the attitude of the ISS, while sacrificing momentum margin. A Momentum Management controller is used to minimize the active CMG momentum, while sacrificing attitude error.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "ATTITUDE HOLD";
            case 1:
                return "MOM MGMT";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
