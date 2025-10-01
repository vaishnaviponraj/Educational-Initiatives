public class DoorLock implements SmartDevice {
    private int id;
    private boolean locked = true;

    public DoorLock(int id) { this.id = id; }

    @Override
    public int getId() { return id; }

    @Override
    public String getType() { return "DoorLock"; }

    @Override
    public void turnOn() { locked = true; }   // ON = locked

    @Override
    public void turnOff() { locked = false; } // OFF = unlocked

    @Override
    public String getStatus() {
        return "Door " + id + " is " + (locked ? "Locked" : "Unlocked");
    }
}
