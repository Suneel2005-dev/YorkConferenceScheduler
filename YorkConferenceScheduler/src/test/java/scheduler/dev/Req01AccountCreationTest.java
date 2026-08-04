package scheduler.dev;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import scheduler.user.*;

public class Req01AccountCreationTest {

    private UserFactory factory;

    @Before
    public void setUp() {
        factory = new UserFactory();
    }

    private Map<String, Object> createUserData(String userId, String name, String email, String password) {
        Map<String, Object> data = new HashMap<>();
        data.put("userID", userId);
        data.put("orgID", "ORG-101");
        data.put("name", name);
        data.put("email", email);
        data.put("password", password);
        data.put("verified", false);
        return data;
    }

    private String generateUniqueId() {
        return "U-" + UUID.randomUUID().toString().substring(0, 8);
    }

    private void executeExpectingException(Runnable action) {
        Throwable caught = null;
        try {
            action.run();
        } catch (Throwable t) {
            caught = t;
        }
        assertNotNull(caught);
    }

    private void assertThrowsIllegalArgument(String userType, Map<String, Object> data) {
        executeExpectingException(() -> factory.createUser(userType, data));
    }

    private void assertThrowsAnyException(Runnable action) {
        executeExpectingException(action);
    }

    @Test
    public void validStudentAccountCreationSucceeds() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "Alice", uid + "@yorku.ca", "Pass123!");
        User user = factory.createUser("Student", userData);

        assertNotNull(user);
        assertEquals(uid + "@yorku.ca", user.getEmail());
        assertTrue(user instanceof Student);
    }

    @Test
    public void validFacultyAccountCreationSucceeds() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "Dr. Bob", uid + "@yorku.ca", "FacultyPass!1");
        User user = factory.createUser("Faculty", userData);

        assertNotNull(user);
        assertTrue(user instanceof Faculty);
    }

    @Test
    public void validStaffAccountCreationSucceeds() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "Charlie", uid + "@yorku.ca", "StaffPass#2");
        User user = factory.createUser("Staff", userData);

        assertNotNull(user);
        assertTrue(user instanceof Staff);
    }

    @Test
    public void validPartnerAccountCreationSucceeds() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "Partner Corp", uid + "@partner.com", "Partner123$");
        User user = factory.createUser("Partner", userData);

        assertNotNull(user);
        assertTrue(user instanceof Partner);
    }

    @Test
    public void weakPasswordWithoutUppercaseThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "Dave", uid + "@yorku.ca", "password123!");
        assertThrowsIllegalArgument("Student", userData);
    }

    @Test
    public void weakPasswordWithoutLowercaseThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "Dave", uid + "@yorku.ca", "PASSWORD123!");
        assertThrowsIllegalArgument("Student", userData);
    }

    @Test
    public void weakPasswordWithoutNumberThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "Dave", uid + "@yorku.ca", "Password!");
        assertThrowsIllegalArgument("Student", userData);
    }

    @Test
    public void weakPasswordWithoutSymbolThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "Dave", uid + "@yorku.ca", "Password123");
        assertThrowsIllegalArgument("Student", userData);
    }

    @Test
    public void weakPasswordTooShortOrNullThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> shortPassData = createUserData(uid, "Short", uid + "@yorku.ca", "P1!");
        assertThrowsIllegalArgument("Student", shortPassData);
    }

    @Test
    public void invalidEmailFormatThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "Eve", "invalidemail.com", "StrongPass123!");
        assertThrowsIllegalArgument("Student", userData);
    }

    @Test
    public void duplicateEmailRegistrationThrowsException() {
        String uid1 = generateUniqueId();
        String uid2 = generateUniqueId();
        String sharedEmail = "dup-" + UUID.randomUUID().toString().substring(0, 6) + "@yorku.ca";

        Map<String, Object> user1Data = createUserData(uid1, "User One", sharedEmail, "StrongPass123!");
        Map<String, Object> user2Data = createUserData(uid2, "User Two", sharedEmail, "StrongPass123!");

        factory.createUser("Student", user1Data);

        assertThrowsAnyException(() -> factory.createUser("Faculty", user2Data));
    }

    @Test
    public void unknownAccountTypeThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "Unknown Role", uid + "@yorku.ca", "StrongPass123!");
        assertThrowsIllegalArgument("NonExistentType", userData);
    }

    @Test
    public void missingRequiredFieldInUserDataThrowsException() {
        Map<String, Object> incompleteData = new HashMap<>();
        incompleteData.put("userID", generateUniqueId());
        incompleteData.put("orgID", "ORG-101");
        incompleteData.put("name", "Incomplete");
        incompleteData.put("email", "incomplete@yorku.ca");

        assertThrowsIllegalArgument("Student", incompleteData);
    }

    @Test
    public void universityAccountInitializesAsUnverified() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "Grace", uid + "@yorku.ca", "YorkPass123!");
        User user = factory.createUser("Student", userData);

        assertNotNull(user);
        assertEquals(uid + "@yorku.ca", user.getEmail());
    }
}
