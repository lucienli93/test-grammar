package multithread;

public class ThreadOne extends Thread {
    private String name;
    public ThreadOne(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.print(name + ": " + i + ";   ");
            if (i % 10 == 0) {
                System.out.println();
                this.yield();
            }
        }
    }
    
}
