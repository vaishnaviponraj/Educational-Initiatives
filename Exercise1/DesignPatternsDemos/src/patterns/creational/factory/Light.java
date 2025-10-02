package patterns.creational.factory;

public class Light implements SmartDevice {
    private final int id;
    private boolean on = false;
    public Light(int id) { this.id = id; }
    public void turnOn(){ on = true; }
    public void turnOff(){ on = false; }
    @Override public int getId(){ return id; }
    @Override public String getType(){ return "Light"; }
    @Override public String getStatus(){ return "Light " + id + " is " + (on ? "On" : "Off"); }
}
