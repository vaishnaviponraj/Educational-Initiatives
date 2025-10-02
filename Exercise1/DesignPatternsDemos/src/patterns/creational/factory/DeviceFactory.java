package patterns.creational.factory;

public class DeviceFactory {
    public static SmartDevice create(String type, int id) {
        switch (type.toLowerCase()) {
            case "light": return new Light(id);
            case "thermostat": return new Thermostat(id);
            case "camera": return new Camera(id);
            default: throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}

