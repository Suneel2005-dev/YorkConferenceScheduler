package scheduler.user;

public class Staff extends User {

    public Staff() {
    }

    public Staff(String userID, String email, String password,
            String organizationID, boolean isVerified) {

        super(userID, email, password, organizationID, isVerified);
    }
}