package patterns.structural.proxy;

import java.util.Set;
import java.util.HashSet;

public class SimpleAuthService implements AuthorizationService {
    private final Set<String> owners = new HashSet<>();
    public SimpleAuthService() { owners.add("owner"); } // owner allowed
    @Override
    public boolean isAllowed(String user, String action) {
        // super simple: only "owner" can unlock
        return owners.contains(user);
    }
}
