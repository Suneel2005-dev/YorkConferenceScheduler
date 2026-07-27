package scheduler.user;

public abstract class User {

    protected String userID;
    protected String email;
    protected String password;
    protected String orgID;
    protected boolean isVerified;

    public User() {
    }

    public User(String userID, String email, String password,
            String orgID, boolean isVerified) {

        this.userID = userID;
        this.email = email;
        this.password = password;
        this.orgID = orgID;
        this.isVerified = isVerified;
    }

    public String getUserID() {
        return userID;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getOrgID() {
        return orgID;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        this.isVerified = verified;
    }

    public boolean checkPassword(String enteredPassword) {
        return password != null && password.equals(enteredPassword);
    }

    public String getAccountType() {
        return getClass().getSimpleName();
    }
}