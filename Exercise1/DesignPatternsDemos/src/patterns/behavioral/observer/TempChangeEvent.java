package patterns.behavioral.observer;

public class TempChangeEvent {
    public final int thermostatId;
    public final int temperature;
    public TempChangeEvent(int id, int temp) { this.thermostatId = id; this.temperature = temp; }
}
