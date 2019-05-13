package multithread;

import java.util.concurrent.CountDownLatch;

public class VisibilityTest {
    private static boolean ready;
    private static int number;
    static CountDownLatch CountDownLatch = new CountDownLatch(2);
 
    private static class ReaderThread extends Thread {
        public void run() {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!ready) {
                System.out.println(ready);
            }
            System.out.println(number);
            CountDownLatch.countDown();
        }
    }
 
    private static class WriterThread extends Thread {
        public void run() {
            try {
                Thread.sleep(11);
                CountDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number = 100;
            ready = true;
        }
    }
 
    public static void main(String[] args) {
        new WriterThread().start();
        new ReaderThread().start();
        try {
			CountDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("finished");
    }
}