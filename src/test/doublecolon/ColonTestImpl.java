package test.doublecolon;

public class ColonTestImpl {
    
    public ColonTestImpl() {
        System.out.println("Hello ::");
    }
    
    public ColonTestImpl(String consoleValue) {
        System.out.println(consoleValue);
    }
    
    public static boolean startWithAA(String value) {
        return value.startsWith("AA");
    }
    
    public boolean endWithAA(String value) {
        return value.endsWith("AA");
    }
}
