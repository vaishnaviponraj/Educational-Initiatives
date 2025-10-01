public class Main {
    public static void main(String[] args) {
        SmartHub hub = new SmartHub();

        // Create devices
        SmartDevice light1 = DeviceFactory.create("light", 1);
        SmartDevice thermostat1 = DeviceFactory.create("thermostat", 2);
        SmartDevice door1 = DeviceFactory.create("door", 3);

        // Wrap door in proxy (no access)
        SmartDevice doorProxy = new DeviceProxy(door1, false);

        // Add to hub
        hub.addDevice(light1);
        hub.addDevice(thermostat1);
        hub.addDevice(doorProxy);

        // Status check
        hub.showStatus();

        // Try controlling devices
        hub.turnOnDevice(1);  // light
        hub.turnOnDevice(2);  // thermostat
        hub.turnOnDevice(3);  // door (will fail - proxy)

        hub.showStatus();

        // Observer pattern demo
        TriggerManager triggers = new TriggerManager();
        triggers.addObserver(hub);

        triggers.motionDetected();  // should auto turn on light 1
        hub.showStatus();

        // Scheduler demo
        Scheduler scheduler = new Scheduler();
        scheduler.schedule(() -> {
            hub.turnOffDevice(1);
            System.out.println("Scheduled: Turned off Light 1");
            hub.showStatus();
        }, 5); // after 5 sec
    }
}
