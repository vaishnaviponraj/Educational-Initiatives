package patterns.behavioral.observer;

public class MobileNotifier implements Observer {
    @Override
    public void update(TempChangeEvent e) {
        if (e.temperature >= 30) {
            System.out.println("[Mobile] Alert sent: thermostat " + e.thermostatId + " temperature = " + e.temperature);
        }
    }
}
