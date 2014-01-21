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

/*
 * Members of console sets.
 */
public enum Console
    implements ConsoleSet
{
    /*
     * EVA
     */
    EVA(new AIRLOCK000001(), new AIRLOCK000002(), new AIRLOCK000003(), new AIRLOCK000004(), new AIRLOCK000005(), new AIRLOCK000006(), new AIRLOCK000007(), new AIRLOCK000008(), new AIRLOCK000009(), new AIRLOCK000010(), new AIRLOCK000011(), new AIRLOCK000012(), new AIRLOCK000013(), new AIRLOCK000014(), new AIRLOCK000015(), new AIRLOCK000016(), new AIRLOCK000017(), new AIRLOCK000018(), new AIRLOCK000019(), new AIRLOCK000020(), new AIRLOCK000021(), new AIRLOCK000022(), new AIRLOCK000023(), new AIRLOCK000024(), new AIRLOCK000025(), new AIRLOCK000026(), new AIRLOCK000027(), new AIRLOCK000028(), new AIRLOCK000029(), new AIRLOCK000030(), new AIRLOCK000031(), new AIRLOCK000032(), new AIRLOCK000033(), new AIRLOCK000034(), new AIRLOCK000035(), new AIRLOCK000036(), new AIRLOCK000037(), new AIRLOCK000038(), new AIRLOCK000039(), new AIRLOCK000040(), new AIRLOCK000041(), new AIRLOCK000042(), new AIRLOCK000043(), new AIRLOCK000044(), new AIRLOCK000045(), new AIRLOCK000046(), new AIRLOCK000047(), new AIRLOCK000048()),
    /*
     * ADCO
     */
    ADCO(new Z1000001(), new Z1000002(), new Z1000003(), new Z1000004(), new Z1000005(), new Z1000006(), new Z1000007(), new Z1000008(), new Z1000009(), new Z1000010(), new Z1000011(), new Z1000012(), new USLAB000001(), new USLAB000002(), new USLAB000003(), new USLAB000004(), new USLAB000005(), new USLAB000006(), new USLAB000007(), new USLAB000008(), new USLAB000009(), new USLAB000011(), new USLAB000013(), new USLAB000014(), new USLAB000015(), new USLAB000016(), new USLAB000017(), new USLAB000018(), new USLAB000019(), new USLAB000020(), new USLAB000021(), new USLAB000022(), new USLAB000023(), new USLAB000024(), new USLAB000025(), new USLAB000026(), new USLAB000027(), new USLAB000028(), new USLAB000029(), new USLAB000030(), new USLAB000031(), new USLAB000038(), new USLAB000039(), new USLAB000040(), new USLAB000041(), new USLAB000042(), new USLAB000043(), new USLAB000044(), new USLAB000045(), new USLAB000046(), new USLAB000047(), new USLAB000048(), new USLAB000049(), new USLAB000050(), new USLAB000051(), new USLAB000052()),
    /*
     * TOPO
     */
    TOPO(new USLAB000032(), new USLAB000033(), new USLAB000034(), new USLAB000035(), new USLAB000036(), new USLAB000037(), new USLAB000102()),
    /*
     * CRONUS
     */
    CRONUS(new P1000004(), new P1000005(), new P1000006(), new P1000007(), new P1000008(), new P1000009(), new P3000001(), new P3000002(), new P4000003(), new P4000006(), new P6000003(), new P6000006(), new S0000010(), new S0000011(), new S0000012(), new S0000013(), new S1000004(), new S1000006(), new S1000007(), new S1000008(), new S1000009(), new S3000001(), new S3000002(), new S4000003(), new S4000006(), new S6000003(), new S6000006(), new Z1000013(), new Z1000014(), new Z1000015(), new NODE1000001(), new NODE1000002(), new NODE2000004(), new NODE2000005(), new NODE3000014(), new NODE3000015(), new NODE3000016(), new NODE3000020(), new AIRLOCK000058(), new USLAB000066(), new USLAB000067(), new USLAB000068(), new USLAB000069(), new USLAB000070(), new USLAB000071(), new USLAB000072(), new USLAB000073(), new USLAB000074(), new USLAB000075(), new USLAB000076(), new USLAB000077(), new USLAB000078(), new USLAB000079(), new USLAB000080(), new USLAB000082(), new USLAB000083(), new USLAB000084(), new USLAB000085(), new USLAB000087(), new USLAB000088(), new USLAB000089(), new USLAB000090(), new USLAB000091(), new USLAB000092(), new USLAB000093(), new USLAB000094(), new USLAB000095(), new USLAB000096(), new USLAB000097(), new USLAB000098(), new USLAB000099(), new USLAB000100(), new USLAB000101()),
    /*
     * SPARTAN
     */
    SPARTAN(new P1000001(), new P1000002(), new P1000003(), new P4000001(), new P4000002(), new P4000004(), new P4000005(), new P4000007(), new P4000008(), new P6000001(), new P6000002(), new P6000004(), new P6000005(), new P6000007(), new P6000008(), new S1000001(), new S1000002(), new S1000003(), new S4000001(), new S4000002(), new S4000004(), new S4000005(), new S4000007(), new S4000008(), new S6000001(), new S6000002(), new S6000004(), new S6000005(), new S6000007(), new S6000008()),
    /*
     * VVO
     */
    VVO(new S0000001(), new S0000002(), new S0000003(), new S0000004(), new S0000005(), new S0000006(), new S0000007(), new S0000008(), new S0000009(), new S1000005(), new USLAB000010(), new USLAB000012(), new USLAB000081(), new USLAB000086()),
    /*
     * NA
     */
    NA(new TIME_000001(), new TIME_000002()),
    /*
     * ETHOS
     */
    ETHOS(new NODE2000001(), new NODE2000002(), new NODE2000003(), new NODE2000006(), new NODE2000007(), new NODE3000001(), new NODE3000002(), new NODE3000003(), new NODE3000004(), new NODE3000005(), new NODE3000006(), new NODE3000007(), new NODE3000008(), new NODE3000009(), new NODE3000010(), new NODE3000011(), new NODE3000012(), new NODE3000013(), new NODE3000017(), new NODE3000018(), new NODE3000019(), new AIRLOCK000049(), new AIRLOCK000050(), new AIRLOCK000051(), new AIRLOCK000052(), new AIRLOCK000053(), new AIRLOCK000054(), new AIRLOCK000055(), new AIRLOCK000056(), new AIRLOCK000057(), new USLAB000053(), new USLAB000054(), new USLAB000055(), new USLAB000056(), new USLAB000057(), new USLAB000058(), new USLAB000059(), new USLAB000060(), new USLAB000061(), new USLAB000062(), new USLAB000063(), new USLAB000064(), new USLAB000065());


    public final static Schematic[] For(String name){
        try {
            return valueOf(name).schematic();
        }
        catch (RuntimeException exc){
            return null;
        }
    }


    private final Schematic[] schematic;

    private Console(Schematic... s){
        schematic = s;
    }


    public Schematic[] schematic(){
        return this.schematic.clone();
    }
    public String join(String sep){
        StringBuilder string = new StringBuilder();
        final int count = schematic.length;
        for (int cc = 0; cc < count; cc++){
            if (0 != cc){
                string.append(sep);
            }
            string.append(schematic[cc].name);
        }
        return string.toString();
    }
}
