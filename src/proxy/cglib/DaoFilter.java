package proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.CallbackFilter;

public class DaoFilter implements CallbackFilter {

    @Override
    public int accept(Method method) {
        String methodName = method.getName();
        int index = 0;
        switch (methodName) {
            case "delete": 
                index = 0;
            break;
            case "update": 
                index = 1;
            break;
            default:
                index = 2;
            break;
        }
        return index;
    }

}
