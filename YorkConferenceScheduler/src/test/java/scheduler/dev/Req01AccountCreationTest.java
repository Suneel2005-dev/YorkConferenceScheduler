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
    public void invalidEmailFormatThrowsException() {
        Map<String, Object> userData = createUserData("U001", "invalidemail.com", "Password_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutUppercaseThrowsException() {
        Map<String, Object> userData = createUserData("U001", "user1@example.com", "password_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutLowercaseThrowsException() {
        Map<String, Object> userData = createUserData("U001", "user1@example.com", "PASSWORD_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutNumberThrowsException() {
        Map<String, Object> userData = createUserData("U001", "user1@example.com", "Password_!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordWithoutSymbolThrowsException() {
        Map<String, Object> userData = createUserData("U001", "user1@example.com", "Password123", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void weakPasswordTooShortThrowsException() {
        Map<String, Object> userData = createUserData("U001", "user1@example.com", "P1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void nullPasswordThrowsException() {
        Map<String, Object> userData = createUserData("U001", "user1@example.com", null, "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void nullOrEmptyEmailThrowsException() {
        Map<String, Object> userData = createUserData("U001", null, "Password_1!", "ORG001");
        verifyCreateUserFails("Student", userData);
    }

    @Test
    public void unknownAccountTypeThrowsException() {
        Map<String, Object> userData = createUserData("U001", "user1@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails("NonExistentType", userData);
    }

    @Test
    public void nullUserTypeThrowsException() {
        Map<String, Object> userData = createUserData("U001", "user1@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails(null, userData);
    }

    @Test
    public void nullMapDataThrowsException() {
        verifyCreateUserFails("Student", null);
    }

    @Test
    public void missingRequiredFieldInUserDataThrowsException() {
        Map<String, Object> incompleteData = new HashMap<>();
        incompleteData.put("userID", "U001");
        incompleteData.put("orgID", "ORG001");
        verifyCreateUserFails("Student", incompleteData);
    }

    @Test
    public void testGetInstanceReturnsNonNullCoordinator() {
        ChiefEventCoordinator coordinator =
                ChiefEventCoordinator.getInstance();

        assertNotNull(coordinator);
    }

    @Test
    public void testGetInstanceReturnsSameObject() {
        ChiefEventCoordinator first =
                ChiefEventCoordinator.getInstance();

        ChiefEventCoordinator second =
                ChiefEventCoordinator.getInstance();

        assertSame(first, second);
    }

    @Test
    public void testAuthenticateWithCorrectCredentials() {
        ChiefEventCoordinator coordinator =
                ChiefEventCoordinator.getInstance();

        boolean authenticated = coordinator.authenticate(
                "chief@yorku.ca",
                "Chief123!"
        );

        assertTrue(authenticated);
    }

    @Test
    public void testAuthenticateWithIncorrectPassword() {
        ChiefEventCoordinator coordinator =
                ChiefEventCoordinator.getInstance();

        boolean authenticated = coordinator.authenticate(
                "chief@yorku.ca",
                "WrongPassword123!"
        );

        assertFalse(authenticated);
    }

    @Test
    public void testAuthenticateWithIncorrectEmail() {
        ChiefEventCoordinator coordinator =
                ChiefEventCoordinator.getInstance();

        boolean authenticated = coordinator.authenticate(
                "notchief@yorku.ca",
                "Chief123!"
        );

        assertFalse(authenticated);
    }

    @Test
    public void testAuthenticateWithNullCredentials() {
        ChiefEventCoordinator coordinator =
                ChiefEventCoordinator.getInstance();

        assertFalse(coordinator.authenticate(null, null));
    }

    @Test
    public void testAuthenticateWithEmptyCredentials() {
        ChiefEventCoordinator coordinator =
                ChiefEventCoordinator.getInstance();

        assertFalse(coordinator.authenticate("", ""));
    }

    @Test
    public void testGenerateAdminAccountReturnsAdministrator() {
        ChiefEventCoordinator coordinator =
                ChiefEventCoordinator.getInstance();

        String uniqueValue = String.valueOf(System.nanoTime());
        String email = "admin" + uniqueValue + "@yorku.ca";
        String adminID = "ADMIN-" + uniqueValue;

        Administrator administrator =
                coordinator.generateAdminAccount(email, adminID);

        assertNotNull(administrator);
    }

    @Test
    public void testGeneratedAdministratorHasCorrectEmail() {
        ChiefEventCoordinator coordinator =
                ChiefEventCoordinator.getInstance();

        String uniqueValue = String.valueOf(System.nanoTime());
        String email = "admin" + uniqueValue + "@yorku.ca";
        String adminID = "ADMIN-" + uniqueValue;

        Administrator administrator =
                coordinator.generateAdminAccount(email, adminID);

        assertNotNull(administrator);
        assertEquals(email, administrator.getEmail());
    }

    @Test
    public void testGeneratedAdministratorHasCorrectAdminID() {
        ChiefEventCoordinator coordinator =
                ChiefEventCoordinator.getInstance();

        String uniqueValue = String.valueOf(System.nanoTime());
        String email = "admin" + uniqueValue + "@yorku.ca";
        String adminID = "ADMIN-" + uniqueValue;

        Administrator administrator =
                coordinator.generateAdminAccount(email, adminID);

        assertNotNull(administrator);
        assertEquals(adminID, administrator.getAdminID());
    }

    @Test
    public void testGenerateDifferentAdministratorAccounts() {
        ChiefEventCoordinator coordinator =
                ChiefEventCoordinator.getInstance();

        String uniqueValue = String.valueOf(System.nanoTime());

        Administrator first = coordinator.generateAdminAccount(
                "first" + uniqueValue + "@yorku.ca",
                "ADMIN-FIRST-" + uniqueValue
        );

        Administrator second = coordinator.generateAdminAccount(
                "second" + uniqueValue + "@yorku.ca",
                "ADMIN-SECOND-" + uniqueValue
        );

        assertNotNull(first);
        assertNotNull(second);
        assertNotSame(first, second);
        assertNotEquals(first.getAdminID(), second.getAdminID());
        assertNotEquals(first.getEmail(), second.getEmail());
    }
}
