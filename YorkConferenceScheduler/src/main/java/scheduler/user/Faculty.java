package scheduler.user;

public class Faculty extends User {

    public Faculty() {
    }

    public Faculty(String userID, String email, String password,
            String organizationID, boolean isVerified) {

        super(userID, email, password, organizationID, isVerified);
    }
}