import namebuilder.SecondaryName;

/**
 * Created by sven1103 on 9/09/16.
 */
public class Main {

    public static void main (String[] args)
    {
        SecondaryName myName = new SecondaryName();
        myName.setEntityID("R");
        myName.setEntityCounter(1);
        myName.setTimepoints(new String[]{"0","1","2"});
        myName.setTissue("S");
        myName.setExtractType("D");
        myName.setExtractAliquot(1);
        System.out.println(myName.toString());
    }
}
