/*
 * Copyright 2014, John Pritchard, Syntelos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package schema;

public class USLAB000095
    extends Schematic
{

    public USLAB000095(){
        super("USLAB000095","VSRC_DL1","event","64","enum","1=S3 Aft (S3AFT)|2=S1 Upper Outboard (S1UPOB)|4=S1 Lower Outboard (S1LOOB)|7=S1 Upper Inboard (S1UPIB)|8=S1 Lower Inboard (S1LOIB)|11=P1 Upper Inboard (P1UPIB)|14=P1 Lower Inboard (P1LOIB)|16=P1 Upper Outboard (P1UPOB)|19=P1 Lower Outboard (P1LOOB)|21=P3 Aft (P3AFT)|25=Node 2 Nadir (NOD2LO)|26=Node 1 Zenith (NOD1UP)|28=Lab Starboard (LABS)|13=Node 3 Starboard/Forward (NOD3S)|40=SSRMS Base LEE (BLEE)|43=SSRMS Base Elbow (BELB)|48=SSRMS Tip Elbow (TELB)|51=SSRMS Tip LEE (TLEE)|32=MBS POA (POA)|35=MBS CLPA LAUNCH (MBS CLPA)|37=MBS CLPA (MAST)|33=SPDM Spare (SPDMS1)|34=SPDM Spare (SPDMS2)|36=SPDM LEE (SPDMLEE)|56=SPDM Arm 1 OTCM (OTCM1)|57=SPDM Body Camera 1 (BODY1)|58=SPDM Arm 2 OTCM (OTCM2)|59=SPDM Body Camera 2 (BODY2)|60=MSS Payload Camera 1 (SSRMS PL1)|61=MSS Payload Camera 2 (SSRMS PL2)|62=MSS Payload Camera 3 (SSRMS PL3)|63=MSS Payload Camera 4 (MSS PL1)|64=MSS Payload Camera 5 (MSS PL2)|5=JEM Channel 1 (JPM a)|6=JEM Channel 2 (JPM b)|9=APM Channel 1 (COL 1)|10=APM Channel 2 (COL 2)|17=Orbiter Channel 1 (ORB1)|18=Orbiter Channel 2 (ORB2)|52=AVU1 Channel A (Lab AVU1)|53=AVU1 Channel B (Lab AVU2)|54=AVU2 Channel A (CUP AVU1)|55=AVU2 Channel B (CUP AVU2)|23=VTR1 PLAYBACK (VTR1)|24=VTR2 PLAYBACK (VTR2)|3=SCU 1 MUX Output (SCU1)|12=SCU 2 MUX Output (SCU2)|15=SCU 1 Test Pattern (SCU1 Test)|20=SCU 2 Test Pattern (SCU2 Test)|68=LAB Camcorder (LABCAM)|77=Airlock Camcorder (A/L CAM)|79=Node 1 Camcorder (N1 CAM)|80=Node 3 Camcorder (N3 CAM)|65=ISPR LAB1D3 (LAB1D3)|66=ISPR LAB1P2 (LAB1P2)|67=ISPR LAB1P4 (LAB1P4)|69=ISPR LAB1O5 (LAB105)|70=ISPR LAB1O4 (LAB104)|71=ISPR LAB1O3 (LAB103)|72=ISPR LAB1O2 (LAB102)|73=ISPR LAB1O1 (LAB101)|74=ISPR LAB1S1 (LAB1S1)|75=ISPR LAB1S2 (LAB1S2)|76=ISPR LAB1S3 (LAB1S3)|78=ISPR LAB1S4 (LAB1S4)","Video Source Routed to Downlink 1","Video Source Routed to Downlink 1");
    }


    public Object parse(String string){
        try {
            int iv = Integer.parseInt(string);
            switch(iv){
            case 1:
                return "S3 Aft (S3AFT)";
            case 2:
                return "S1 Upper Outboard (S1UPOB)";
            case 4:
                return "S1 Lower Outboard (S1LOOB)";
            case 7:
                return "S1 Upper Inboard (S1UPIB)";
            case 8:
                return "S1 Lower Inboard (S1LOIB)";
            case 11:
                return "P1 Upper Inboard (P1UPIB)";
            case 14:
                return "P1 Lower Inboard (P1LOIB)";
            case 16:
                return "P1 Upper Outboard (P1UPOB)";
            case 19:
                return "P1 Lower Outboard (P1LOOB)";
            case 21:
                return "P3 Aft (P3AFT)";
            case 25:
                return "Node 2 Nadir (NOD2LO)";
            case 26:
                return "Node 1 Zenith (NOD1UP)";
            case 28:
                return "Lab Starboard (LABS)";
            case 13:
                return "Node 3 Starboard/Forward (NOD3S)";
            case 40:
                return "SSRMS Base LEE (BLEE)";
            case 43:
                return "SSRMS Base Elbow (BELB)";
            case 48:
                return "SSRMS Tip Elbow (TELB)";
            case 51:
                return "SSRMS Tip LEE (TLEE)";
            case 32:
                return "MBS POA (POA)";
            case 35:
                return "MBS CLPA LAUNCH (MBS CLPA)";
            case 37:
                return "MBS CLPA (MAST)";
            case 33:
                return "SPDM Spare (SPDMS1)";
            case 34:
                return "SPDM Spare (SPDMS2)";
            case 36:
                return "SPDM LEE (SPDMLEE)";
            case 56:
                return "SPDM Arm 1 OTCM (OTCM1)";
            case 57:
                return "SPDM Body Camera 1 (BODY1)";
            case 58:
                return "SPDM Arm 2 OTCM (OTCM2)";
            case 59:
                return "SPDM Body Camera 2 (BODY2)";
            case 60:
                return "MSS Payload Camera 1 (SSRMS PL1)";
            case 61:
                return "MSS Payload Camera 2 (SSRMS PL2)";
            case 62:
                return "MSS Payload Camera 3 (SSRMS PL3)";
            case 63:
                return "MSS Payload Camera 4 (MSS PL1)";
            case 64:
                return "MSS Payload Camera 5 (MSS PL2)";
            case 5:
                return "JEM Channel 1 (JPM a)";
            case 6:
                return "JEM Channel 2 (JPM b)";
            case 9:
                return "APM Channel 1 (COL 1)";
            case 10:
                return "APM Channel 2 (COL 2)";
            case 17:
                return "Orbiter Channel 1 (ORB1)";
            case 18:
                return "Orbiter Channel 2 (ORB2)";
            case 52:
                return "AVU1 Channel A (Lab AVU1)";
            case 53:
                return "AVU1 Channel B (Lab AVU2)";
            case 54:
                return "AVU2 Channel A (CUP AVU1)";
            case 55:
                return "AVU2 Channel B (CUP AVU2)";
            case 23:
                return "VTR1 PLAYBACK (VTR1)";
            case 24:
                return "VTR2 PLAYBACK (VTR2)";
            case 3:
                return "SCU 1 MUX Output (SCU1)";
            case 12:
                return "SCU 2 MUX Output (SCU2)";
            case 15:
                return "SCU 1 Test Pattern (SCU1 Test)";
            case 20:
                return "SCU 2 Test Pattern (SCU2 Test)";
            case 68:
                return "LAB Camcorder (LABCAM)";
            case 77:
                return "Airlock Camcorder (A/L CAM)";
            case 79:
                return "Node 1 Camcorder (N1 CAM)";
            case 80:
                return "Node 3 Camcorder (N3 CAM)";
            case 65:
                return "ISPR LAB1D3 (LAB1D3)";
            case 66:
                return "ISPR LAB1P2 (LAB1P2)";
            case 67:
                return "ISPR LAB1P4 (LAB1P4)";
            case 69:
                return "ISPR LAB1O5 (LAB105)";
            case 70:
                return "ISPR LAB1O4 (LAB104)";
            case 71:
                return "ISPR LAB1O3 (LAB103)";
            case 72:
                return "ISPR LAB1O2 (LAB102)";
            case 73:
                return "ISPR LAB1O1 (LAB101)";
            case 74:
                return "ISPR LAB1S1 (LAB1S1)";
            case 75:
                return "ISPR LAB1S2 (LAB1S2)";
            case 76:
                return "ISPR LAB1S3 (LAB1S3)";
            case 78:
                return "ISPR LAB1S4 (LAB1S4)";
            default:
                return string;
            }
        }
        catch (NumberFormatException exc){
            return string;
        }
    }

}
