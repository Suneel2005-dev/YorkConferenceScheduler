package scheduler.user;

public class Partner extends User {

    public Partner() {
    }

    public Partner(String userID, String email, String password,
            String organizationID, boolean isVerified) {

        super(userID, email, password, organizationID, isVerified);
    }
}