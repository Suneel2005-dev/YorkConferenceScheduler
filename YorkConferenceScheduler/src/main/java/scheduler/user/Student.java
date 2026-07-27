package scheduler.user;

public class Student extends User {

    public Student() {
    }

    public Student(String userID, String email, String password,
            String studentNumber, boolean isVerified) {

        super(userID, email, password, studentNumber, isVerified);
    }
}