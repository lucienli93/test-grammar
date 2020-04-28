package test.singleton;

public enum SingletonENUM {
    INSTANCE(1, "number1");
    private int age;
    private String name;

    private SingletonENUM(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
