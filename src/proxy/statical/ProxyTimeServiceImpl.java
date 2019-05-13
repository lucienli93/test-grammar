package proxy.statical;

public class ProxyTimeServiceImpl implements TimeService {
    private TimeService timeService;
    public ProxyTimeServiceImpl(TimeService timeService) {
        this.timeService = timeService;
    }
    
    @Override
    public void sleepSceond(int many) {
        System.out.println("before");
        long startTime = System.currentTimeMillis();
        timeService.sleepSceond(many);
        System.out.println("duration(ms): " + (System.currentTimeMillis() - startTime));
        System.out.println("after");
    }

}
