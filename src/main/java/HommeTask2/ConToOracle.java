package HommeTask2;

import javax.enterprise.inject.Produces;

/**
 * Created by vasylchenko on 16.05.2017.
 */
@AnConToOracle
public class ConToOracle implements  Connection {

    @Produces @AnConToOracle @AnCountTable
    private int countTable = 320;

    @Produces @AnConToOracle @AnCountView
    private int countView = 440;

    @Produces @AnConToOracle
    private String hostDriver = "jdbc:Oracle";


    public void printBDConnection() {
        System.out.println("BDConnection - " + hostDriver);
    }

    @Produces @AnConToOracle @AnCountAllObject
    public int countAllObject()  {
        return (countTable + countView);
    }
}
