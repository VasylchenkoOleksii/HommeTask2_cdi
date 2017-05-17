package HommeTask2;

/**
 * Created by vasylchenko on 16.05.2017.
 */
public interface Connection {

    // просто печатаем к какой БД подключились
    void printBDConnection();

    //считаем на основании полей countTable + countView (см.ниже)
    int countAllObject();

}
