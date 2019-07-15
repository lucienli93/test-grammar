package multithread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestSleepInSubMethod {

    public static void main(String[] args) {
        TestSleepInSubMethod testSleepInSubMethodInstance = new TestSleepInSubMethod();
        ThreadPoolExecutor excecutor = new ThreadPoolExecutor(10, 20, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(90));
        int count = 3;
        while (count > 0) {
            testSleepInSubMethodInstance.test(excecutor);
            count--;
        }
        excecutor.shutdown();
        System.out.println("");
    }
    
    private void test(ThreadPoolExecutor excecutor) {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new TestSleep(i, countDownLatch));
            excecutor.execute(t);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private class TestSleep implements Runnable {
        private int currentIndex = 0;
        private CountDownLatch countDownLatch = null;

        public TestSleep(int currentIndex, CountDownLatch countDownLatch) {
            this.currentIndex = currentIndex;
            this.countDownLatch = countDownLatch;
        }
        
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println(currentIndex);
            } catch (InterruptedException e) {
                System.out.println("Exception: Thread.sleep(1000)");
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
            
        }
        
    }
}
