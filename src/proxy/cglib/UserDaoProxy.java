package proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class UserDaoProxy implements MethodInterceptor {

    /*
     * parameters:
     * object: enriched object.
     * method: intercepted method.
     * objects: parameters list, the basic data type needs to be passed its wrapper type.
     * proxy: proxy of method.
     * @see org.springframework.cglib.proxy.MethodInterceptor#intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], org.springframework.cglib.proxy.MethodProxy)
     */
    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
        System.out.println("Before Method Invoke!");
        proxy.invokeSuper(object, objects);  //invoke proxy method.
        System.out.println("After Method Invoke!");
        return object;
    }
    
}
