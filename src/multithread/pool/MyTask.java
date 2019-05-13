package multithread.pool;

public class MyTask implements Runnable {
    private int taskNum;
    
    public MyTask(int num) {
        this.taskNum = num;
    }
    
    @SuppressWarnings("static-access")
    @Override
    public void run() {
        System.out.println("����ִ��Task: " + taskNum);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Task: " + taskNum + "ִ�����");
    }
    
}
