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

    private String generateUniqueId() {
        return "U" + UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8);
    }

    private Map<String, Object> createUserData(String userId, String name, String email, String password, String orgId) {
        Map<String, Object> data = new HashMap<>();
        data.put("userID", userId);
        data.put("orgID", orgId);
        data.put("name", name);
        data.put("email", email);
        data.put("password", password);
        return data;
    }

    private void verifyCreateUserFails(String userType, Map<String, Object> data) {
        boolean thrown = false;
        try {
            factory.createUser(userType, data);
        } catch (Throwable t) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void validStudentAccountCreationSucceeds() {
        String uid = generateUniqueId();
        String email = "student_" + uid + "@example.com";
        Map<String, Object> userData = createUserData(uid, "New Student", email, "Password_1!", "ORG001");
        User user = factory.createUser("Student", userData);

        assertNotNull(user);
        assertEquals(email, user.getEmail());
        assertTrue(user instanceof Student);
    }

    @Test
    public void validFacultyAccountCreationSucceeds() {
        String uid = generateUniqueId();
        String email = "faculty_" + uid + "@example.com";
        Map<String, Object> userData = createUserData(uid, "New Faculty", email, "Password_2!", "ORG001");
        User user = factory.createUser("Faculty", userData);

        assertNotNull(user);
        assertEquals(email, user.getEmail());
        assertTrue(user instanceof Faculty);
    }

    @Test
    public void validStaffAccountCreationSucceeds() {
        String uid = generateUniqueId();
        String email = "staff_" + uid + "@example.com";
        Map<String, Object> userData = createUserData(uid, "New Staff", email, "Password_3!", "ORG002");
        User user = factory.createUser("Staff", userData);

        assertNotNull(user);
        assertEquals(email, user.getEmail());
        assertTrue(user instanceof Staff);
    }

    @Test
    public void validPartnerAccountCreationSucceeds() {
        String uid = generateUniqueId();
        String email = "partner_" + uid + "@example.com";
        Map<String, Object> userData = createUserData(uid, "New Partner", email, "Password_4!", "ORG002");
        User user = factory.createUser("Partner", userData);

        assertNotNull(user);
        assertEquals(email, user.getEmail());
        assertTrue(user instanceof Partner);
    }

    @Test
    public void duplicateUserIdOrEmailRegistrationThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> duplicateData = createUserData(uid, "User Five", "user1@example.com", "Password_5!", "ORG001");
        verifyCreateUserFails("Student", duplicateData);
    }

    @Test
    public void invalidEmailFormatThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "User Six", "invalidemail.com", "Password_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutUppercaseThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "User Seven", "u_" + uid + "@example.com", "password_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutLowercaseThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "User Eight", "u_" + uid + "@example.com", "PASSWORD_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutNumberThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "User Nine", "u_" + uid + "@example.com", "Password_!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutSymbolThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "User Ten", "u_" + uid + "@example.com", "Password123", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordTooShortThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "User Eleven", "u_" + uid + "@example.com", "P1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void nullPasswordThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "User Twelve", "u_" + uid + "@example.com", null, "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void nullOrEmptyEmailThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "User Thirteen", null, "Password_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void unknownAccountTypeThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "User Fourteen", "u_" + uid + "@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails("NonExistentType", userData);
    }

    @Test
    public void nullUserTypeThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> userData = createUserData(uid, "User Fifteen", "u_" + uid + "@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails(null, userData);
    }

    @Test
    public void nullMapDataThrowsException() {
        verifyCreateUserFails("Student", null);
    }

    @Test
    public void missingRequiredFieldInUserDataThrowsException() {
        String uid = generateUniqueId();
        Map<String, Object> incompleteData = new HashMap<>();
        incompleteData.put("userID", uid);
        incompleteData.put("orgID", "ORG001");
        verifyCreateUserFails("Student", incompleteData);
    }

    @Test
    public void verifyHelperFailsWhenUserCreationSucceeds() {
        String uid = generateUniqueId();
        String email = "valid_" + uid + "@example.com";
        Map<String, Object> validData = createUserData(uid, "Valid User", email, "Password_1!", "ORG001");

        boolean assertionTriggered = false;
        try {
            verifyCreateUserFails("Student", validData);
        } catch (AssertionError e) {
            assertionTriggered = true;
        }
        assertTrue(assertionTriggered);
    }
}
