package HommeTask2;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import java.util.List;


/**
 * Created by vasylchenko on 16.05.2017.
 */
public class MetaDataBD {

    @Inject
    private Connection connection;

    @Inject   @AnCountTable
    private int countTable;

    @Inject   @AnCountView
    private int countView;

    @Inject
    private String hostDriver;

    @Inject  @AnCountAllObject
    private int countAllObject;

    public void printDataDB(){
        connection.printBDConnection();
    }

    @Interceptors(DataInterceptor.class)
    public void printDataAll(){
        System.out.println("Count of all objects  " + countAllObject);
        System.out.println("Database is  " + hostDriver);
    }

    @Inject @ListBD
    private List<String> listBD;

    public void  printListBD(){
        System.out.println("ListBD - ");
        for (String bdlist : listBD){
            System.out.println(bdlist);
        }
    }

}
