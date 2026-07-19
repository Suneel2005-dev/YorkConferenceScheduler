package scheduler.user;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.security.SecureRandom;
import java.util.List;

import javax.swing.JOptionPane;

public class ChiefEventCoordinator {

    private static ChiefEventCoordinator instance;
    private String coordID;

    private static final String COORDINATOR_EMAIL = "chief@yorku.ca";
    private static final String COORDINATOR_PASSWORD = "Chief123!";

    private static final Path ACCOUNTS_FILE = Path.of("accounts.csv");

    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*";
    private static final String ALL_CHARACTERS =
            UPPERCASE + LOWERCASE + NUMBERS + SYMBOLS;

    private static final SecureRandom RANDOM = new SecureRandom();

    private ChiefEventCoordinator() {
    }

    public static ChiefEventCoordinator getInstance() {
        if (instance == null) {
            instance = new ChiefEventCoordinator();
        }

        return instance;
    }

    public boolean authenticate(String email, String password) {
        return COORDINATOR_EMAIL.equalsIgnoreCase(email)
                && COORDINATOR_PASSWORD.equals(password);
    }

    public Administrator generateAdminAccount(
            String email,
            String adminID) {

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException(
                    "Administrator email cannot be empty.");
        }

        if (adminID == null || adminID.isBlank()) {
            throw new IllegalArgumentException(
                    "Administrator ID cannot be empty.");
        }

        if (accountExists(email, adminID)) {
            throw new IllegalArgumentException(
                    "An account with this email or ID already exists.");
        }

        String password = generateRandomPassword();

        String accountRow = String.join(",",
                clean(adminID),
                clean(email),
                clean(password),
                "ADMIN",
                "administrator",
                "true");

        try {
            Files.writeString(
                    ACCOUNTS_FILE,
                    System.lineSeparator() + accountRow,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException exception) {
            throw new IllegalStateException(
                    "Could not save the administrator account.",
                    exception);
        }

        Administrator administrator =
                new Administrator(email, adminID);

        JOptionPane.showMessageDialog(
                null,
                "Administrator account created successfully.\n\n"
                        + "Email: " + email + "\n"
                        + "Password: " + password,
                "Administrator Account Created",
                JOptionPane.INFORMATION_MESSAGE);

        return administrator;
    }

    private boolean accountExists(String email, String adminID) {
        if (!Files.exists(ACCOUNTS_FILE)) {
            return false;
        }

        try {
            List<String> lines = Files.readAllLines(ACCOUNTS_FILE);

            for (int i = 1; i < lines.size(); i++) {
                String[] account = lines.get(i).split(",", -1);

                if (account.length < 2) {
                    continue;
                }

                String existingID = account[0].trim();
                String existingEmail = account[1].trim();

                if (existingID.equalsIgnoreCase(adminID)
                        || existingEmail.equalsIgnoreCase(email)) {
                    return true;
                }
            }
        } catch (IOException exception) {
            throw new IllegalStateException(
                    "Could not read existing accounts.",
                    exception);
        }

        return false;
    }

    private String generateRandomPassword() {
        StringBuilder password = new StringBuilder();

        // Guarantee that the password passes the strong-password rules.
        password.append(randomCharacter(UPPERCASE));
        password.append(randomCharacter(LOWERCASE));
        password.append(randomCharacter(NUMBERS));
        password.append(randomCharacter(SYMBOLS));

        while (password.length() < 12) {
            password.append(randomCharacter(ALL_CHARACTERS));
        }

        // Randomize the positions of the required characters.
        for (int i = password.length() - 1; i > 0; i--) {
            int randomIndex = RANDOM.nextInt(i + 1);

            char character = password.charAt(i);

            password.setCharAt(
                    i,
                    password.charAt(randomIndex));

            password.setCharAt(
                    randomIndex,
                    character);
        }

        return password.toString();
    }

    private char randomCharacter(String characters) {
        return characters.charAt(
                RANDOM.nextInt(characters.length()));
    }

    private String clean(String value) {
        return value.replace(",", " ").trim();
    }
}