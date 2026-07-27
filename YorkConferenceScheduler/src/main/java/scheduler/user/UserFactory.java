package scheduler.user;

import java.util.HashMap;
import java.util.Map;

import scheduler.database.CsvDatabase;

public class UserFactory {

    private static final Map<String, User> usersByID = new HashMap<>();
    private static final Map<String, User> usersByEmail = new HashMap<>();

    static {
        loadUsers();
    }

    public User createUser(String type, Map<String, Object> details) {

        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Account type is required.");
        }

        if (details == null) {
            throw new IllegalArgumentException("User details are required.");
        }

        String userID = getRequiredString(details, "userID");
        String email = getRequiredString(details, "email");
        String password = getRequiredString(details, "password");
        String orgID = getRequiredString(details, "orgID");

        validateEmail(email);
        validatePassword(password);

        String normalizedUserID = userID.toLowerCase();
        String normalizedEmail = email.toLowerCase();

        if (usersByID.containsKey(normalizedUserID)) {
            throw new IllegalArgumentException(
                    "A user with this user ID already exists.");
        }

        if (usersByEmail.containsKey(normalizedEmail)) {
            throw new IllegalArgumentException(
                    "An account with this email already exists.");
        }

        boolean universityAccount = isUniversityAccount(type);
        boolean verified = !universityAccount || isYorkEmail(email);

        User user = createUserObject(
                type,
                userID,
                email,
                password,
                orgID,
                verified);

        storeUser(user);

        CsvDatabase.append(
                CsvDatabase.ACCOUNTS_FILE,
                String.join(",",
                        CsvDatabase.clean(userID),
                        CsvDatabase.clean(email),
                        CsvDatabase.clean(password),
                        CsvDatabase.clean(orgID),
                        CsvDatabase.clean(type.toLowerCase()),
                        Boolean.toString(verified)));

        return user;
    }

    public User getUserByID(String userID) {
        if (userID == null || userID.isBlank()) {
            return null;
        }

        return usersByID.get(userID.trim().toLowerCase());
    }

    public User getUserByEmail(String email) {
        if (email == null || email.isBlank()) {
            return null;
        }

        return usersByEmail.get(email.trim().toLowerCase());
    }

    public boolean isEmailRegistered(String email) {
        if (email == null || email.isBlank()) {
            return false;
        }

        return usersByEmail.containsKey(email.trim().toLowerCase());
    }

    public boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }

        return email.matches(
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    public boolean isStrongPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasLowercase = password.matches(".*[a-z].*");
        boolean hasNumber = password.matches(".*\\d.*");
        boolean hasSymbol = password.matches(".*[^A-Za-z0-9].*");

        return hasUppercase
                && hasLowercase
                && hasNumber
                && hasSymbol;
    }

    private static void loadUsers() {
        for (String[] row
                : CsvDatabase.read(CsvDatabase.ACCOUNTS_FILE)) {

            if (row.length < 6) {
                continue;
            }

            String userID = row[0].trim();
            String email = row[1].trim();
            String password = row[2];
            String orgID = row[3].trim();
            String accountType = row[4].trim();
            boolean verified = Boolean.parseBoolean(row[5].trim());

            try {
                User user = createUserObject(
                        accountType,
                        userID,
                        email,
                        password,
                        orgID,
                        verified);

                storeUser(user);
            } catch (IllegalArgumentException exception) {
                System.err.println(
                        "Skipped invalid account row for user: " + userID);
            }
        }
    }

    private static User createUserObject(
            String type,
            String userID,
            String email,
            String password,
            String orgID,
            boolean verified) {

        switch (type.trim().toLowerCase()) {
        case "student":
            return new Student(
                    userID, email, password, orgID, verified);

        case "faculty":
            return new Faculty(
                    userID, email, password, orgID, verified);

        case "staff":
            return new Staff(
                    userID, email, password, orgID, verified);

        case "partner":
            return new Partner(
                    userID, email, password, orgID, verified);

        default:
            throw new IllegalArgumentException(
                    "Unsupported account type: " + type);
        }
    }

    private static void storeUser(User user) {
        usersByID.put(
                user.getUserID().toLowerCase(),
                user);

        usersByEmail.put(
                user.getEmail().toLowerCase(),
                user);
    }

    private String getRequiredString(
            Map<String, Object> details,
            String key) {

        Object value = details.get(key);

        if (value == null || value.toString().trim().isEmpty()) {
            throw new IllegalArgumentException(key + " is required.");
        }

        return value.toString().trim();
    }

    private void validateEmail(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException(
                    "A valid email address is required.");
        }
    }

    private void validatePassword(String password) {
        if (!isStrongPassword(password)) {
            throw new IllegalArgumentException(
                    "Password must contain at least 8 characters, "
                    + "including uppercase, lowercase, a number, "
                    + "and a symbol.");
        }
    }

    private boolean isUniversityAccount(String type) {
        String normalizedType = type.trim().toLowerCase();

        return normalizedType.equals("student")
                || normalizedType.equals("faculty")
                || normalizedType.equals("staff");
    }

    private boolean isYorkEmail(String email) {
        String normalizedEmail = email.toLowerCase();

        return normalizedEmail.endsWith("@yorku.ca")
                || normalizedEmail.endsWith("@my.yorku.ca");
    }
}