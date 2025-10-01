public class Thermostat implements SmartDevice {
    private int id;
    private boolean isOn = false;
    private int temperature = 22; // default

    public Thermostat(int id) { this.id = id; }

    @Override
    public int getId() { return id; }

    @Override
    public String getType() { return "Thermostat"; }

    @Override
    public void turnOn() { isOn = true; }

    @Override
    public void turnOff() { isOn = false; }

    public void setTemperature(int temp) {
        this.temperature = temp;
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is " + (isOn ? "On, " + temperature + "°C" : "Off");
    }
}
