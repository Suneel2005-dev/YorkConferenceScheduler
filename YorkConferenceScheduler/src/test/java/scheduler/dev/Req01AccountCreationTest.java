package scheduler.dev;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Object> userData = createUserData("U005", "New Student", "student5@example.com", "Password_1!", "ORG001");
        User user = factory.createUser("Student", userData);

        assertNotNull(user);
        assertEquals("student5@example.com", user.getEmail());
        assertTrue(user instanceof Student);
    }

    @Test
    public void validFacultyAccountCreationSucceeds() {
        Map<String, Object> userData = createUserData("U006", "New Faculty", "faculty6@example.com", "Password_2!", "ORG001");
        User user = factory.createUser("Faculty", userData);

        assertNotNull(user);
        assertEquals("faculty6@example.com", user.getEmail());
        assertTrue(user instanceof Faculty);
    }

    @Test
    public void validStaffAccountCreationSucceeds() {
        Map<String, Object> userData = createUserData("U007", "New Staff", "staff7@example.com", "Password_3!", "ORG002");
        User user = factory.createUser("Staff", userData);

        assertNotNull(user);
        assertEquals("staff7@example.com", user.getEmail());
        assertTrue(user instanceof Staff);
    }

    @Test
    public void validPartnerAccountCreationSucceeds() {
        Map<String, Object> userData = createUserData("U008", "New Partner", "partner8@example.com", "Password_4!", "ORG002");
        User user = factory.createUser("Partner", userData);

        assertNotNull(user);
        assertEquals("partner8@example.com", user.getEmail());
        assertTrue(user instanceof Partner);
    }

    @Test
    public void duplicateUserIdOrEmailRegistrationThrowsException() {
        // user1@example.com is already registered in accounts.csv (U001)
        Map<String, Object> duplicateData = createUserData("U009", "User Nine", "user1@example.com", "Password_5!", "ORG001");
        verifyCreateUserFails("Student", duplicateData);
    }

    @Test
    public void invalidEmailFormatThrowsException() {
        Map<String, Object> userData = createUserData("U010", "User Ten", "invalidemail.com", "Password_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutUppercaseThrowsException() {
        Map<String, Object> userData = createUserData("U011", "User Eleven", "user11@example.com", "password_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutLowercaseThrowsException() {
        Map<String, Object> userData = createUserData("U012", "User Twelve", "user12@example.com", "PASSWORD_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutNumberThrowsException() {
        Map<String, Object> userData = createUserData("U013", "User Thirteen", "user13@example.com", "Password_!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutSymbolThrowsException() {
        Map<String, Object> userData = createUserData("U014", "User Fourteen", "user14@example.com", "Password123", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordTooShortThrowsException() {
        Map<String, Object> userData = createUserData("U015", "User Fifteen", "user15@example.com", "P1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void nullPasswordThrowsException() {
        Map<String, Object> userData = createUserData("U016", "User Sixteen", "user16@example.com", null, "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void nullOrEmptyEmailThrowsException() {
        Map<String, Object> userData = createUserData("U017", "User Seventeen", null, "Password_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void unknownAccountTypeThrowsException() {
        Map<String, Object> userData = createUserData("U018", "User Eighteen", "user18@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails("NonExistentType", userData);
    }

    @Test
    public void nullUserTypeThrowsException() {
        Map<String, Object> userData = createUserData("U019", "User Nineteen", "user19@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails(null, userData);
    }

    @Test
    public void nullMapDataThrowsException() {
        verifyCreateUserFails("Student", null);
    }

    @Test
    public void missingRequiredFieldInUserDataThrowsException() {
        Map<String, Object> incompleteData = new HashMap<>();
        incompleteData.put("userID", "U020");
        incompleteData.put("orgID", "ORG001");
        incompleteData.put("name", "Incomplete User");
        verifyCreateUserFails("Student", incompleteData);
    }

    @Test
    public void verifyHelperFailsWhenUserCreationSucceeds() {
        Map<String, Object> validData = createUserData("U021", "Valid User", "user21@example.com", "Password_1!", "ORG001");

        boolean assertionTriggered = false;
        try {
            verifyCreateUserFails("Student", validData);
        } catch (AssertionError e) {
            assertionTriggered = true;
        }
        assertTrue(assertionTriggered);
    }
}
