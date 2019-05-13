package proxy.statical;

public class RealTimeServiceImpl implements TimeService {

    @Override
    public void sleepSceond(int many) {
        System.out.println("Start sleep");
        try {
            Thread.sleep(many * 1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
