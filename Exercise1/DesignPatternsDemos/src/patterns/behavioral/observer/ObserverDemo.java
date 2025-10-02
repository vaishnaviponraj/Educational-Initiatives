package patterns.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Thermostat t = new Thermostat(1, 22);
        t.register(new AcController());
        t.register(new EventLogger());
        t.register(new MobileNotifier());

        System.out.println("== set to 28 ==");
        t.setTemperature(28);

        System.out.println("== set to 32 ==");
        t.setTemperature(32);
    }
}
