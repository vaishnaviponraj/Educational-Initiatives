package patterns.creational.factory;

public class Camera implements SmartDevice {
    private final int id;
    public Camera(int id){ this.id = id; }
    @Override public int getId(){ return id; }
    @Override public String getType(){ return "Camera"; }
    @Override public String getStatus(){ return "Camera " + id + " (idle)"; }
}
