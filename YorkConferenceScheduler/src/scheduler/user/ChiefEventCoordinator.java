package user;

public class ChiefEventCoordinator {

    private static ChiefEventCoordinator instance;
    private String coordID;

    private ChiefEventCoordinator() {

    }

    public static ChiefEventCoordinator getInstance() {
        if (instance == null) {
            instance = new ChiefEventCoordinator();
        }
        return instance;
    }

    public Administrator generateAdminAccount(String email, String adminID) {
        return null;
    }
    
}