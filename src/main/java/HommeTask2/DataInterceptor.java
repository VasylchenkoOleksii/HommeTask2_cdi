package HommeTask2;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 * Created by vasylchenko on 17.05.2017.
 */
public class DataInterceptor {
    @AroundInvoke
    public Object InterceptorPrintDataAll(InvocationContext ic) throws Exception{
        System.out.println("Метод рrintDataAll перехвачен");
        return ic.proceed();
    }
}
