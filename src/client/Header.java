package client;

public class Header
{

    public final String name, value;

    public final Integer integer;

    public Header(String line){
        int idx = line.indexOf(':');
        this.name = line.substring(0,idx).trim();
        this.value = line.substring(idx+1).trim();
        {
            Integer integer = null;
            try {
                integer = new Integer(this.value);
            }
            catch (NumberFormatException exc){
            }
            this.integer = integer;
        }
    }
}
