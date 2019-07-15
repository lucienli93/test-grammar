package multithread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainTest {
    public static void main(String [] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(2));
        try {
            for (int i = 0; i < 6; i++) {
                MyTask myTask = new MyTask(i);
                executor.execute(myTask);
                System.out.println("线程池中线程数目:  " + executor.getPoolSize() + ", 队列中等待执行的任务数目:  " + executor.getQueue().size() 
                        + "已执行完别的任务的数目: " + executor.getCompletedTaskCount());
            }
        } catch (RuntimeException ex) {
            throw ex;
        } finally {
            executor.shutdown();
        }
    }
}
