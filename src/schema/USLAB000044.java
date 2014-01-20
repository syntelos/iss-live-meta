package schema;

public class USLAB000044
    extends Schematic
{

    public USLAB000044(){
        super("USLAB000044","GPS2","event","64","enum","0=DOING POSITION FIXES|1=SV TIMING|2=APPROXIMATE TIMING|3=GPS TIME|4=NEED INITIALIZATION|5=GDOP NEEDED|6=BAD TIMING|7=NO USABLE SAT|8=TRACK 1 SAT|9=TRACK 2 SAT|10=TRACK 3 SAT|11=BAD INTEGRITY|12=NO VEL AVAIL|13=UNUSABLE FIX","Global Positioning System (GPS-2) Ops Status","Global Positioning System (GPS-2) Ops Status. Operational status of the software processes occurring in GPS 2.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "DOING POSITION FIXES";
            case 1:
                return "SV TIMING";
            case 2:
                return "APPROXIMATE TIMING";
            case 3:
                return "GPS TIME";
            case 4:
                return "NEED INITIALIZATION";
            case 5:
                return "GDOP NEEDED";
            case 6:
                return "BAD TIMING";
            case 7:
                return "NO USABLE SAT";
            case 8:
                return "TRACK 1 SAT";
            case 9:
                return "TRACK 2 SAT";
            case 10:
                return "TRACK 3 SAT";
            case 11:
                return "BAD INTEGRITY";
            case 12:
                return "NO VEL AVAIL";
            case 13:
                return "UNUSABLE FIX";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
