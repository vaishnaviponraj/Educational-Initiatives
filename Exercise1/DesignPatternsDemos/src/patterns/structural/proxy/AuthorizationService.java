package patterns.structural.proxy;

public interface AuthorizationService {
    boolean isAllowed(String user, String action);
}
