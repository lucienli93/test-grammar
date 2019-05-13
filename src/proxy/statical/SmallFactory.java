package proxy.statical;

public class SmallFactory {
    private static TimeService timeSerciceInstance = null;
    
    public static TimeService getTimeService() {
        if (timeSerciceInstance == null) {
            synchronized (TimeService.class) {
                if (timeSerciceInstance == null) {
                    timeSerciceInstance = new ProxyTimeServiceImpl(new RealTimeServiceImpl());
                }
            }
        }
        return timeSerciceInstance;
    }
}
