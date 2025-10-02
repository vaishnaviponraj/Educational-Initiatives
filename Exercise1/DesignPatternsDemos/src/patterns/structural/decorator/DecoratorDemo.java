package patterns.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        VideoDevice cam = new Camera();
        VideoDevice camWithAlerts = new MotionAlertDecorator(cam);

        camWithAlerts.start();
        camWithAlerts.stop();
    }
}
