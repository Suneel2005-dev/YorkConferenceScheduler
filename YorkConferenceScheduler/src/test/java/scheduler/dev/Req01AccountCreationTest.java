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

    private Map<String, Object> createUserData(String userId, String email, String password, String orgId) {
        Map<String, Object> data = new HashMap<>();
        data.put("userID", userId);
        data.put("orgID", orgId);
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
        assertTrue("Expected exception was not thrown", thrown);
    }

    @Test
    public void validStudentAccountCreationSucceeds() {
        String uid = "U_" + UUID.randomUUID().toString().substring(0, 8);
        Map<String, Object> userData = createUserData(uid, uid + "@example.com", "Password_1!", "ORG001");
        User user = factory.createUser("Student", userData);

        assertNotNull(user);
        assertTrue(user instanceof Student);
    }

    @Test
    public void validFacultyAccountCreationSucceeds() {
        String uid = "U_" + UUID.randomUUID().toString().substring(0, 8);
        Map<String, Object> userData = createUserData(uid, uid + "@example.com", "Password_2!", "ORG001");
        User user = factory.createUser("Faculty", userData);

        assertNotNull(user);
        assertTrue(user instanceof Faculty);
    }

    @Test
    public void validStaffAccountCreationSucceeds() {
        String uid = "U_" + UUID.randomUUID().toString().substring(0, 8);
        Map<String, Object> userData = createUserData(uid, uid + "@example.com", "Password_3!", "ORG002");
        User user = factory.createUser("Staff", userData);

        assertNotNull(user);
        assertTrue(user instanceof Staff);
    }

    @Test
    public void validPartnerAccountCreationSucceeds() {
        String uid = "U_" + UUID.randomUUID().toString().substring(0, 8);
        Map<String, Object> userData = createUserData(uid, uid + "@example.com", "Password_4!", "ORG002");
        User user = factory.createUser("Partner", userData);

        assertNotNull(user);
        assertTrue(user instanceof Partner);
    }

    @Test
    public void existingEmailRegistrationThrowsException() {
        String uid = "U_" + UUID.randomUUID().toString().substring(0, 8);
        // user1@example.com is already registered in accounts.csv
        Map<String, Object> duplicateData = createUserData(uid, "user1@example.com", "Password_5!", "ORG001");
        verifyCreateUserFails("Student", duplicateData);
    }

    @Test
    public void invalidEmailFormatThrowsException() {
        Map<String, Object> userData = createUserData("U999", "invalidemail.com", "Password_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutUppercaseThrowsException() {
        Map<String, Object> userData = createUserData("U999", "test999@example.com", "password_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutLowercaseThrowsException() {
        Map<String, Object> userData = createUserData("U999", "test999@example.com", "PASSWORD_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutNumberThrowsException() {
        Map<String, Object> userData = createUserData("U999", "test999@example.com", "Password_!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutSymbolThrowsException() {
        Map<String, Object> userData = createUserData("U999", "test999@example.com", "Password123", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordTooShortThrowsException() {
        Map<String, Object> userData = createUserData("U999", "test999@example.com", "P1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void nullPasswordThrowsException() {
        Map<String, Object> userData = createUserData("U999", "test999@example.com", null, "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void nullOrEmptyEmailThrowsException() {
        Map<String, Object> userData = createUserData("U999", null, "Password_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void unknownAccountTypeThrowsException() {
        Map<String, Object> userData = createUserData("U999", "test999@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails("NonExistentType", userData);
    }

    @Test
    public void nullUserTypeThrowsException() {
        Map<String, Object> userData = createUserData("U999", "test999@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails(null, userData);
    }

    @Test
    public void nullMapDataThrowsException() {
        verifyCreateUserFails("Student", null);
    }

    @Test
    public void missingRequiredFieldInUserDataThrowsException() {
        Map<String, Object> incompleteData = new HashMap<>();
        incompleteData.put("userID", "U999");
        incompleteData.put("orgID", "ORG001");
        verifyCreateUserFails("Student", incompleteData);
    }
}
