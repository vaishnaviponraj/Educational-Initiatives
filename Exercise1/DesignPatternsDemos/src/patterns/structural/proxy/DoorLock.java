package patterns.structural.proxy;

public class DoorLock {
    private final int id;
    private boolean locked = true;
    public DoorLock(int id) { this.id = id; }
    public void lock() { locked = true; System.out.println("[DoorLock] Door " + id + " LOCKED"); }
    public void unlock() { locked = false; System.out.println("[DoorLock] Door " + id + " UNLOCKED"); }
    public boolean isLocked() { return locked; }
}
