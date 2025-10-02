package patterns.structural.proxy;

public class DoorLockProxy {
    private final DoorLock real;
    private final AuthorizationService auth;
    private final String user;

    public DoorLockProxy(DoorLock real, AuthorizationService auth, String user) {
        this.real = real; this.auth = auth; this.user = user;
    }

    public void lock() {
        if (auth.isAllowed(user, "lock")) {
            real.lock(); System.out.println("[Proxy] Locked by " + user);
        } else {
            System.out.println("[Proxy] Access denied to lock for " + user);
        }
    }

    public void unlock() {
        if (auth.isAllowed(user, "unlock")) {
            real.unlock(); System.out.println("[Proxy] Unlocked by " + user);
        } else {
            System.out.println("[Proxy] Access denied to unlock for " + user);
        }
    }
}
