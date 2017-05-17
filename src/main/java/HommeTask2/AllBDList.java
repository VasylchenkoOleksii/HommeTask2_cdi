package HommeTask2;

import javax.enterprise.inject.Produces;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasylchenko on 17.05.2017.
 */
public class AllBDList {
    @Produces @ListBD
    public List<String> AllBd (){
        ArrayList<String> listbd = new ArrayList<String>();
        listbd.add("jdbc:Oracle");
        listbd.add("jdbc:MySQL");
        listbd.add("jdbc:PostgreSQL");
        return listbd;
    }
}
