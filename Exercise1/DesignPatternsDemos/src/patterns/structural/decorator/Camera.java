package patterns.structural.decorator;

public class Camera implements VideoDevice {
    @Override
    public void start() { System.out.println("[Camera] Camera started"); }
    @Override
    public void stop() { System.out.println("[Camera] Camera stopped"); }
}
