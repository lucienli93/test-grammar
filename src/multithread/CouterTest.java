package multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class CouterTest {
    private static volatile int counter = 0;
    private static AtomicInteger atomicCounter = new AtomicInteger(0);
    
    public static void main(String [] args) {
        testCounter();
//        testAutomicInteger();
    }
    
    private static void testAutomicInteger() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 50000; i++) {
                    System.out.println("automicT1: " + atomicCounter.addAndGet(1));
                }
            }
            
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 50000; i++) {
                    System.out.println("automicT2: " + atomicCounter.addAndGet(1));
                }
            }
            
        }).start();
    }
    
    private static void testCounter() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 500000; i++) {
                    int temp = counter;
                    do {
                        temp = temp + 1;
                    } while (!checkAndSetCounter(temp));
//                    counter++;
                    System.out.println("t1: " + counter);
                }
                
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 500000; i++) {
                    int temp = counter;
                    do {
                        temp = temp + 1;
                    } while (!checkAndSetCounter(temp));
//                    counter++;
                    System.out.println("t2: " + counter);
                }
                
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(counter);
    }
    
    private static boolean checkAndSetCounter(int temp) {
        if (temp == counter + 1) {
            counter = temp;
            return true;
        }
        return false;
    }
    
}
