package proxy.cglib;

public class UserDao {
    public void update(String name, int age) {
        System.out.println("name: " + name + "\nage: " + age);
    }
    
    public void delete(String name) {
        System.out.println("name: " + name);
    }
}
