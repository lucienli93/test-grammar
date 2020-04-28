package test.singleton;

public class SingletonNoLock {
    private SingletonNoLock() {}
    public static SingletonNoLock getInatance() {
        return CreateInstance.instance;
    }

    private static class CreateInstance {
        private static SingletonNoLock instance = new SingletonNoLock();
    }
}
