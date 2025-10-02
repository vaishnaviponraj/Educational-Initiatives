package patterns.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        SmartDevice d1 = DeviceFactory.create("light", 1);
        SmartDevice d2 = DeviceFactory.create("camera", 5);
        System.out.println(d1.getStatus());
        System.out.println(d2.getStatus());
    }
}
