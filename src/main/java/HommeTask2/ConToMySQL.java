package HommeTask2;

import javax.enterprise.inject.Produces;

/**
 * Created by vasylchenko on 16.05.2017.
 */
@AnConToMySQL
public class ConToMySQL implements Connection {

    @Produces @AnConToMySQL @AnCountTable
    private int countTable = 20;

    @Produces @AnConToMySQL @AnCountView
    private int countView = 40;

    @Produces @AnConToMySQL
    private String hostDriver = "jdbc:MySQL";


    public void printBDConnection() {
        System.out.println("BDConnection - " + hostDriver);
    }

    @Produces @AnConToMySQL @AnCountAllObject
    public int countAllObject() {
        return (countView + countTable);
    }
}
