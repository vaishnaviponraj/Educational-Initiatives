package patterns.creational.factory;

public class Thermostat implements SmartDevice {
    private final int id;
    private int temp;
    public Thermostat(int id){ this.id = id; this.temp = 22; }
    public void setTemperature(int t){ temp = t; }
    @Override public int getId(){ return id; }
    @Override public String getType(){ return "Thermostat"; }
    @Override public String getStatus(){ return "Thermostat " + id + " = " + temp + "°C"; }
}
