package proxy.jdk;

public class MainTest {
    public static void main(String [] args) {
        UserService  userService = new UserServiceImpl();
        CustomInvocationHandler handler = new CustomInvocationHandler(userService);
        UserService serviceProxy = (UserService)handler.getProxy();
        System.out.println(serviceProxy.addUser("name"));
    }
}
