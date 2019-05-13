package proxy.jdk;

public class UserServiceImpl implements UserService {

    @Override
    public String addUser(String name) {
        System.out.println("adding user");
        return name;

    }

}
