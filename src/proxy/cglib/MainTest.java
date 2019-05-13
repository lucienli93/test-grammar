package proxy.cglib;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

public class MainTest {
    public static void main(String [] args) {
        UserDaoProxy userDaoProxy = new UserDaoProxy();
        
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(UserDao.class);
//        enhancer.setCallback(userDaoProxy);
        
//        UserDao userDao = (UserDao)enhancer.create();
//        userDao.delete("haha");
//        userDao.update("name", 18);
        //-----------------------------------------------------------------//
        UserDaoSecondProxy userDaoSecondProxy = new UserDaoSecondProxy();
        
        Enhancer enhancerSecond = new Enhancer();
        enhancerSecond.setSuperclass(UserDao.class);
        enhancerSecond.setCallbacks(new Callback[] {userDaoProxy, userDaoSecondProxy, NoOp.INSTANCE});
        enhancerSecond.setCallbackFilter(new DaoFilter());
        
        UserDao UserDaoSecond = (UserDao)enhancerSecond.create();
        UserDaoSecond.update("name", 18);
        UserDaoSecond.delete("name");
    }
}
