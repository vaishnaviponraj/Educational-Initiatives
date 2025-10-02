package patterns.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        AuthorizationService auth = new SimpleAuthService();
        DoorLock real = new DoorLock(3);

        DoorLockProxy guestProxy = new DoorLockProxy(real, auth, "guest");
        DoorLockProxy ownerProxy = new DoorLockProxy(real, auth, "owner");

        guestProxy.unlock(); // denied
        ownerProxy.unlock(); // allowed
        ownerProxy.lock();
    }
}

