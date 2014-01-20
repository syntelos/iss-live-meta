package schema;

public class USLAB000012
    extends Schematic
{

    public USLAB000012(){
        super("USLAB000012","GNC_M","event","64","enum","0=Default|1=WAIT|2=RESERVED|3=STANDBY|4=CMG ATTITUDE CONTROL|5=CMG THRUSTER ASSIST|6=USER DATA GENERATION|7=FREEDRIFT","US Guidance, Navigation and Control (GNC) Mode","US Guidance, Navigation and Control (GNC) Mode The US GNC computer control mode status that defines which functions are available.  CMG Thruster Assist (CMG TA): the CMGs are used to provide attitude control of the ISS and RS thrusters are available to provide CMG desaturation torques. Drift: used to actively minimize the effects of the CMGs on the ISS so that no torques are created. Wait: nominal mode of the backup GNC computer in which the software is running but most of the functions are on hold. User Data Generation (UDG): the GNC provides pointing data for other systems but does not provide attitude control. CMG Only: the CMGs are used to provide attitude control of the ISS but RS thrusters are unavailable to provide CMG desaturation torques. Standby: a configuration mode to prepare the GNC computer for providing pointing data and attitude control.");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 0:
                return "Default";
            case 1:
                return "WAIT";
            case 2:
                return "RESERVED";
            case 3:
                return "STANDBY";
            case 4:
                return "CMG ATTITUDE CONTROL";
            case 5:
                return "CMG THRUSTER ASSIST";
            case 6:
                return "USER DATA GENERATION";
            case 7:
                return "FREEDRIFT";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
