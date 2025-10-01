public class DeviceProxy implements SmartDevice {
    private SmartDevice device;
    private boolean hasAccess;

    public DeviceProxy(SmartDevice device, boolean hasAccess) {
        this.device = device;
        this.hasAccess = hasAccess;
    }

    @Override
    public int getId() { return device.getId(); }

    @Override
    public String getType() { return device.getType(); }

    @Override
    public void turnOn() {
        if (hasAccess) device.turnOn();
        else System.out.println("Access denied to turn ON " + getType() + " " + getId());
    }

    @Override
    public void turnOff() {
        if (hasAccess) device.turnOff();
        else System.out.println("Access denied to turn OFF " + getType() + " " + getId());
    }

    @Override
    public String getStatus() {
        return device.getStatus();
    }
}
