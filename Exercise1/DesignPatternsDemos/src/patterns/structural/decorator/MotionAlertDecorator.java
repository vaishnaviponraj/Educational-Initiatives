package patterns.structural.decorator;

public class MotionAlertDecorator extends CameraDecorator {
    public MotionAlertDecorator(VideoDevice inner) { super(inner); }
    @Override
    public void start() {
        super.start();
        System.out.println("[Decorator] Motion alert monitoring enabled");
    }
}
