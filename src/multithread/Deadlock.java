package multithread;

public class Deadlock {

    public static void main(String [] args) {
        int [] arr1 = new int [100];
        int [] arr2 = new int [100];
//        for (int i = 0; i < 100; i++) {
//            arr1[i] = i;
//            arr2[i] = i;
//        }
//        ThreadA mt = new ThreadA("arrT", arr1, arr2);
//        ThreadB mt2 = new ThreadB("arrT2", arr1, arr2);
//        Thread a = new Thread(mt);
//        Thread b = new Thread(mt2);
//        a.start();
//        b.start();
        
        new Thread(() -> {
        	synchronized (arr1) {
        		System.out.println("1: arr1");
        		synchronized (arr2) {
        			System.out.println("1: arr2");
        		}
        	}
        }).start();
        new Thread(() -> {
        	synchronized (arr2) {
        		System.out.println("2: arr2");
        		synchronized (arr1) {
        			System.out.println("2: arr1");
        		}
        	}
        }).start();
    }
    
    
}
class ThreadA implements Runnable {
    private String name = "";
    private int [] arr1 = new int [100];
    private int [] arr2 = new int [100];
    
    public ThreadA(String name, int [] arr1, int [] arr2) {
        this.name = name;
        this.arr1 = arr1;
        this.arr2 = arr2;
    }
    
    @Override
    public void run() {
        synchronized (arr1) {
            try {
                System.out.println("sleep 5 s");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            for (int i = 0; i < 100; i++) {
                System.out.println(name + ", arr1: " + arr1[i]);
            }
            synchronized (arr2) {
                System.out.println(name + "arr2");
            }
        }
        
    }
    
}

class ThreadB implements Runnable {
    private String name = "";
    private int [] arr1 = new int [100];
    private int [] arr2 = new int [100];
    
    public ThreadB(String name, int [] arr1, int [] arr2) {
        this.name = name;
        this.arr1 = arr1;
        this.arr2 = arr2;
    }
    @Override
    public void run() {
        synchronized (arr2) {
            try {
                System.out.println("sleep 5 s");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            synchronized (arr1) {
                System.out.println(name + "��ȡarr1");
            }
        }
        
    }
    
}