public class Light implements SmartDevice {
    private int id;
    private boolean isOn = false;

    public Light(int id) { this.id = id; }

    @Override
    public int getId() { return id; }

    @Override
    public String getType() { return "Light"; }

    @Override
    public void turnOn() { isOn = true; }

    @Override
    public void turnOff() { isOn = false; }

    @Override
    public String getStatus() {
        return "Light " + id + " is " + (isOn ? "On" : "Off");
    }
}
