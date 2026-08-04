package scheduler.dev;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import scheduler.user.*;

public class Req02AdministratorGenerationTest {

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
    public void administratorInstantiationPreservesEmail() {
        Administrator admin = new Administrator("admin_test@yorku.ca", "admin1");
        assertNotNull("Administrator instance should not be null", admin);
        assertEquals("admin_test@yorku.ca", admin.getEmail());
    }

    @Test
    public void administratorDefaultPasswordIsNullOnDirectCreation() {
        Administrator admin = new Administrator("admin_test@yorku.ca", "admin1");
        assertNull("Password should be null prior to external assignment/registration", admin.getPassword());
    }

    @Test
    public void administratorMultipleInstancesMaintainSeparateState() {
        Administrator admin1 = new Administrator("admin1@yorku.ca", "admin1");
        Administrator admin2 = new Administrator("admin2@yorku.ca", "admin2");

        assertNotEquals("Different administrator instances must have distinct emails", 
                        admin1.getEmail(), admin2.getEmail());
    }

    @Test
    public void testGeneratedAdministratorHasCorrectAdminID() {
        Administrator administrator = new Administrator("admin1@yorku.ca", "admin1");
        assertNotNull(administrator);
        assertEquals("admin1", administrator.getAdminID());
    }

    @Test
    public void userFactoryRejectsDirectAdministratorCreation() {
        Map<String, Object> adminData = createUserData("admin1", "admin1@yorku.ca", null, "ADMIN");
        verifyCreateUserFails("Administrator", adminData);
    }

    @Test
    public void userFactoryRejectsDirectChiefCoordinatorCreation() {
        Map<String, Object> chiefData = createUserData("admin1", "chief@yorku.ca", "Chief123!", "ADMIN");
        verifyCreateUserFails("ChiefEventCoordinator", chiefData);
    }

    @Test
    public void testGetInstanceReturnsNonNullCoordinator() {
        ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();
        assertNotNull(coordinator);
    }

    @Test
    public void testGetInstanceReturnsSameObject() {
        ChiefEventCoordinator first = ChiefEventCoordinator.getInstance();
        ChiefEventCoordinator second = ChiefEventCoordinator.getInstance();
        assertSame(first, second);
    }

    @Test
    public void testAuthenticateWithCorrectCredentials() {
        ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();
        boolean authenticated = coordinator.authenticate("chief@yorku.ca", "Chief123!");
        assertTrue(authenticated);
    }

    @Test
    public void testAuthenticateWithIncorrectPassword() {
        ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();
        boolean authenticated = coordinator.authenticate("chief@yorku.ca", "WrongPassword123!");
        assertFalse(authenticated);
    }

    @Test
    public void testAuthenticateWithIncorrectEmail() {
        ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();
        boolean authenticated = coordinator.authenticate("notchief@yorku.ca", "Chief123!");
        assertFalse(authenticated);
    }

    @Test
    public void testAuthenticateWithNullCredentials() {
        ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();
        assertFalse(coordinator.authenticate(null, null));
    }

    @Test
    public void testAuthenticateWithEmptyCredentials() {
        ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();
        assertFalse(coordinator.authenticate("", ""));
    }
}
