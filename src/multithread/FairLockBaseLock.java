package multithread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairLockBaseLock {
    private static int count = 30;
    private Lock lock = new ReentrantLock();
    
    public static void main(String [] args) {
        new Thread(new FairLockBaseLock().new Thread1()).start();
        new Thread(new FairLockBaseLock().new Thread2()).start();
        new Thread(new FairLockBaseLock().new Thread3()).start();
    }
    
    public class Thread1 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10;) {
                try {
                    lock.lock();
                    while (count % 3 == 0) {
                        System.out.println("thread one: " + count);
                        count--;
                        i++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        }
        
    }
    public class Thread2 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10;) {
                try {
                    lock.lock();
                    while (count % 3 == 1) {
                        System.out.println("thread two: " + count);
                        count--;
                        i++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        }
        
    }
    public class Thread3 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10;) {
                try {
                    lock.lock();
                    while (count % 3 == 2) {
                        System.out.println("thread three: " + count);
                        count--;
                        i++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        }
        
    }
}
