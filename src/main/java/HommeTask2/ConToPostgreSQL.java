package HommeTask2;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;

/**
 * Created by vasylchenko on 17.05.2017.
 */
@Alternative
public class ConToPostgreSQL implements Connection {
    @Produces @AnCountTable
    private int countTable = 400;

    @Produces @AnCountView
    private int countView = 33;

    @Produces
    private String hostDriver = "jdbc:PostgreSQL";


    public void printBDConnection() {
        System.out.println("BDConnection - " + hostDriver);
    }

    @Produces @AnCountAllObject
    public int countAllObject()  {
        return (countTable + countView);
    }
}
