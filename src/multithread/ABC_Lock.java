package multithread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ABC_Lock {
    private static Lock lock = new ReentrantLock();// 通过JDK5中的Lock锁来保证线程的访问的互斥
    private static int state = 0;//ͨ通过state的值来确定是否打印

    public class ThreadA extends Thread {
        @Override
        public void run() {
                try {
                    lock.lock();
                    while (state % 3 == 0) {// 多线程并发，不能用if，必须用循环测试等待条件，避免虚假唤醒
                        System.out.print("A");
                        state++;
                    }
                } finally {
                    lock.unlock();// unlock()操作必须放在finally块中
                }
        }
    }

    public class ThreadB extends Thread {
        @Override
        public void run() {
                try {
                    lock.lock();
                    while (state % 3 == 1) {// 多线程并发，不能用if，必须用循环测试等待条件，避免虚假唤醒
                        System.out.print("B");
                        state++;
                    }
                } finally {
                    lock.unlock();// unlock()操作必须放在finally块中
                }
        }
    }

    public class ThreadC extends Thread {
        @Override
        public void run() {
                try {
                    lock.lock();
                    while (state % 3 == 2) {// 多线程并发，不能用if，必须用循环测试等待条件，避免虚假唤醒
                        System.out.print("C");
                        state++;
                    }
                } finally {
                    lock.unlock();// unlock()操作必须放在finally块中
                }
        }
    }

    public static void main(String[] args) {
        new ABC_Lock().new ThreadA().start();
        new ABC_Lock().new ThreadB().start();
        new ABC_Lock().new ThreadC().start();
    }
}