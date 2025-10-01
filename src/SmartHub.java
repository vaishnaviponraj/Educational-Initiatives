import java.util.*;

public class SmartHub implements Observer {
    private Map<Integer, SmartDevice> devices = new HashMap<>();

    public void addDevice(SmartDevice device) {
        devices.put(device.getId(), device);
    }

    public void turnOnDevice(int id) {
        if (devices.containsKey(id)) devices.get(id).turnOn();
    }

    public void turnOffDevice(int id) {
        if (devices.containsKey(id)) devices.get(id).turnOff();
    }

    public void showStatus() {
        for (SmartDevice d : devices.values()) {
            System.out.println(d.getStatus());
        }
    }

    @Override
    public void update(Event e) {
        if (e.getDescription().equals("MotionDetected")) {
            System.out.println("SmartHub: Motion event received, turning on Light 1");
            turnOnDevice(1);
        }
    }
}
