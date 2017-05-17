package HommeTask2;


import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        MetaDataBD metaDataBD = container.instance().select(MetaDataBD.class).get();
        metaDataBD.printDataAll();
        metaDataBD.printDataDB();
        metaDataBD.printListBD();
        weld.shutdown();
    }
}
