package multithread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //test join()
//        System.out.println("main thread start");
//        ThreadOne first = new ThreadOne("one");
//        ThreadOne second = new ThreadOne("two");
//        second.start();
//        System.out.println("before second join");
//        System.out.println("after second join");
//        first.start();
//        second.join();
//        first.join();
//        System.out.println("main thread end");
        
        
//        Thread loop = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    System.out.print("loop ");
//                    if (Thread.interrupted()) {
//                        System.out.println("\nexit loop");
//                        break;
//                    }
//                    // Continue to do nothing
//                }
//            }
//        });
//        loop.start();
//        loop.sleep(1000);
//        loop.interrupt();
        
        //fair lock
        Object a = new Object();
        Object b = new Object();
        Thread t1 = new Thread(new FairLock("fair lock 1", a, b));
        Thread t2 = new Thread(new FairLock("fair lock 2", b, a));
        t1.start();
//        Thread.sleep(1000);
        t2.start();
    }
}
