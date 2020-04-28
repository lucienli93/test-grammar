package test.singleton;

public class MainTest {

    public static void main(String[] args) {
        SingletonNoLock instan1 = SingletonNoLock.getInatance();
        SingletonNoLock instan2 = SingletonNoLock.getInatance();
        SingletonNoLock instan3 = SingletonNoLock.getInatance();
        System.out.println(instan1);
        System.out.println(instan2);
        System.out.println(instan3);
        System.out.println(instan3 == instan1);
        System.out.println(instan3 == instan2);
    }

}
