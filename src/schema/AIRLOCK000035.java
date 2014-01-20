package schema;

public class AIRLOCK000035
    extends Schematic
{

    public AIRLOCK000035(){
        super("AIRLOCK000035","ARL_BCA3_CH1","event","64","enum","0=No History - a charge has not been initiated yet|1=Presently charging|2=Task completed normally|3=Task terminated due to stop switch being toggled|4=Task terminated due to an open circuit error|5=Task terminated due to Wrong Batt or Hi-imp|6=Task terminated due to an over-temperature error|7=Amp-hour capacity test result OK|8=Amp-hour capacity test error|9=Task terminated due to low charge slope error|10=Task terminated due to power error|11=Task terminated due to reverse-polarity error|12=Task terminated due to a short-circuit error|13=Task terminated due to a time-out error|14=Task terminated due to an external-temperature error|15=Discharge|16=Wait on Discharge|17=Wait on Charge","Battery Charger Assembly (BCA) 3 Channel 1 Status","Battery Charger Assembly (BCA) 3 Channel 1 Status");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "No History - a charge has not been initiated yet";
            case 1:
                return "Presently charging";
            case 2:
                return "Task completed normally";
            case 3:
                return "Task terminated due to stop switch being toggled";
            case 4:
                return "Task terminated due to an open circuit error";
            case 5:
                return "Task terminated due to Wrong Batt or Hi-imp";
            case 6:
                return "Task terminated due to an over-temperature error";
            case 7:
                return "Amp-hour capacity test result OK";
            case 8:
                return "Amp-hour capacity test error";
            case 9:
                return "Task terminated due to low charge slope error";
            case 10:
                return "Task terminated due to power error";
            case 11:
                return "Task terminated due to reverse-polarity error";
            case 12:
                return "Task terminated due to a short-circuit error";
            case 13:
                return "Task terminated due to a time-out error";
            case 14:
                return "Task terminated due to an external-temperature error";
            case 15:
                return "Discharge";
            case 16:
                return "Wait on Discharge";
            case 17:
                return "Wait on Charge";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
