import java.util.*;

public class TriggerManager implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) { observers.add(o); }

    @Override
    public void removeObserver(Observer o) { observers.remove(o); }

    @Override
    public void notifyObservers(Event e) {
        for (Observer o : observers) {
            o.update(e);
        }
    }

    // Example trigger
    public void motionDetected() {
        System.out.println("Trigger: Motion detected!");
        notifyObservers(new Event("MotionDetected"));
    }
}
