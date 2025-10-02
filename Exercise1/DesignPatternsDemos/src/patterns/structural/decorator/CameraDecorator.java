package patterns.structural.decorator;

public abstract class CameraDecorator implements VideoDevice {
    protected final VideoDevice inner;
    public CameraDecorator(VideoDevice inner) { this.inner = inner; }
    @Override public void start() { inner.start(); }
    @Override public void stop() { inner.stop(); }
}
