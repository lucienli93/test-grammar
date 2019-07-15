package multithread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ABC_Lock {
    private static Lock lock = new ReentrantLock();// ͨ��JDK5�е�Lock������֤�̵߳ķ��ʵĻ���
    private static int state = 0;//ͨ��state��ֵ��ȷ���Ƿ��ӡ

    public class ThreadA extends Thread {
        @Override
        public void run() {
                try {
                    lock.lock();
                    while (state % 3 == 0) {// ���̲߳�����������if��������ѭ�����Եȴ�������������ٻ���
                        System.out.print("A");
                        state++;
                    }
                } finally {
                    lock.unlock();// unlock()�����������finally����
                }
        }
    }

    public class ThreadB extends Thread {
        @Override
        public void run() {
                try {
                    lock.lock();
                    while (state % 3 == 1) {// ���̲߳�����������if��������ѭ�����Եȴ�������������ٻ���
                        System.out.print("B");
                        state++;
                    }
                } finally {
                    lock.unlock();// unlock()�����������finally����
                }
        }
    }

    public class ThreadC extends Thread {
        @Override
        public void run() {
                try {
                    lock.lock();
                    while (state % 3 == 2) {// ���̲߳�����������if��������ѭ�����Եȴ�������������ٻ���
                        System.out.print("C");
                        state++;
                    }
                } finally {
                    lock.unlock();// unlock()�����������finally����
                }
        }
    }

    public static void main(String[] args) {
        new ABC_Lock().new ThreadA().start();
        new ABC_Lock().new ThreadB().start();
        new ABC_Lock().new ThreadC().start();
    }
}