package scheduler.user;

import java.util.HashMap;
import java.util.Map;

public class UserFactory {

	private static final Map<String, User> usersByID = new HashMap<>();
	private static final Map<String, User> usersByEmail = new HashMap<>();

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
			throw new IllegalArgumentException("A user with this user ID already exists.");
		}

		if (usersByEmail.containsKey(normalizedEmail)) {
			throw new IllegalArgumentException("An account with this email already exists.");
		}

		boolean universityAccount = isUniversityAccount(type);
		boolean verified = !universityAccount || isYorkEmail(email);

		User user;

		switch (type.trim().toLowerCase()) {
		case "student":
			user = new Student(userID, email, password, orgID, verified);
			break;

		case "faculty":
			user = new Faculty(userID, email, password, orgID, verified);
			break;

		case "staff":
			user = new Staff(userID, email, password, orgID, verified);
			break;

		case "partner":
			user = new Partner(userID, email, password, orgID, true);
			break;

		default:
			throw new IllegalArgumentException("Unsupported account type: " + type);
		}

		usersByID.put(normalizedUserID, user);
		usersByEmail.put(normalizedEmail, user);

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

		return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
	}

	public boolean isStrongPassword(String password) {
		if (password == null || password.length() < 8) {
			return false;
		}

		boolean hasUppercase = password.matches(".*[A-Z].*");
		boolean hasLowercase = password.matches(".*[a-z].*");
		boolean hasNumber = password.matches(".*\\d.*");
		boolean hasSymbol = password.matches(".*[^A-Za-z0-9].*");

		return hasUppercase && hasLowercase && hasNumber && hasSymbol;
	}

	private String getRequiredString(Map<String, Object> details, String key) {

		Object value = details.get(key);

		if (value == null || value.toString().trim().isEmpty()) {
			throw new IllegalArgumentException(key + " is required.");
		}

		return value.toString().trim();
	}

	private void validateEmail(String email) {
		if (!isValidEmail(email)) {
			throw new IllegalArgumentException("A valid email address is required.");
		}
	}

	private void validatePassword(String password) {
		if (!isStrongPassword(password)) {
			throw new IllegalArgumentException("Password must contain at least 8 characters, "
					+ "including uppercase, lowercase, a number, " + "and a symbol.");
		}
	}

	private boolean isUniversityAccount(String type) {
		String normalizedType = type.trim().toLowerCase();

		return normalizedType.equals("student") || normalizedType.equals("faculty") || normalizedType.equals("staff");
	}

	private boolean isYorkEmail(String email) {
		String normalizedEmail = email.toLowerCase();

		return normalizedEmail.endsWith("@yorku.ca") || normalizedEmail.endsWith("@my.yorku.ca");
	}
}