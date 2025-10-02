package patterns.behavioral.observer;

public class AcController implements Observer {
    @Override
    public void update(TempChangeEvent e) {
        if (e.temperature > 25) {
            System.out.println("[AC] AC: turning ON for thermostat " + e.thermostatId);
        } else {
            System.out.println("[AC] AC: temperature " + e.temperature + " — no action.");
        }
    }
}
