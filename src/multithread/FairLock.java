package multithread;

public class FairLock implements Runnable {
    private String name;
    private Object prev;
    private Object post;
    int count = 10;
    
    public FairLock(String name, Object prev, Object post) {
        this.name = name;
        this.prev = prev;
        this.post = post;
    }
    @Override
    public void run() {
        while (count > 0) {
            synchronized (prev) {
                synchronized (post) {
                    System.out.println(name + ": " + count);
                    post.notify();
                    count--;
                }
                if (count == 0) {
                    prev.notifyAll();
                } else {
                    try {
                        prev.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    
}
