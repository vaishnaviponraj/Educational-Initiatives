import java.util.Timer;
import java.util.TimerTask;

public class Scheduler {
    public void schedule(Runnable task, int seconds) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() { task.run(); }
        }, seconds * 1000);
    }
}
