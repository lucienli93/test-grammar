package proxy.statical;

public class MainTest {

    public static void main(String[] args) {
        TimeService timeService = SmallFactory.getTimeService();
        timeService.sleepSceond(1);

        TimeService timeService2 = SmallFactory.getTimeService();
        timeService2.sleepSceond(1);
        System.out.println(timeService == timeService2);
    }

} 
