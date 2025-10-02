package patterns.behavioral.observer;

public class EventLogger implements Observer {
    @Override
    public void update(TempChangeEvent e) {
        System.out.println("[Logger] Event recorded: thermostat " + e.thermostatId + " = " + e.temperature);
    }
}
