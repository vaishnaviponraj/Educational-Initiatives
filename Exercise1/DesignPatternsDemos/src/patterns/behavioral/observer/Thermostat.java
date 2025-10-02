package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Thermostat implements Subject {
    private final int id;
    private int temperature;
    private final List<Observer> observers = new ArrayList<>();

    public Thermostat(int id, int initial) {
        this.id = id;
        this.temperature = initial;
    }

    public void setTemperature(int t) {
        this.temperature = t;
        System.out.println("[Thermostat] #" + id + " -> temperature set to " + t);
        notifyObservers(new TempChangeEvent(id, t));
    }

    @Override
    public void register(Observer o) { observers.add(o); }

    @Override
    public void unregister(Observer o) { observers.remove(o); }

    @Override
    public void notifyObservers(TempChangeEvent e) {
        // iterate copy to avoid ConcurrentModification
        for (Observer o : new ArrayList<>(observers)) o.update(e);
    }
}
