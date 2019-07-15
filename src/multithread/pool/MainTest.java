package multithread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainTest {
    public static void main(String [] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(2));
        
        for (int i = 0; i < 6; i++) {
            MyTask myTask = new MyTask(i);
            executor.execute(myTask);
            System.out.println("�̳߳����߳���Ŀ:  " + executor.getPoolSize() + ", �����еȴ�ִ�е�������Ŀ:  " + executor.getQueue().size() 
                    + "��ִ�������������Ŀ: " + executor.getCompletedTaskCount());
        }
        executor.shutdown();
    }
}
