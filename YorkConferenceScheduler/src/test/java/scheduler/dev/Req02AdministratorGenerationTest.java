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
    public void userFactoryRejectsUnknownAccountType() {
        Map<String, Object> userData = createUserData("U001", "user1@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails("SuperAdmin", userData);
    }

    @Test
    public void userFactoryRejectsNullAccountType() {
        Map<String, Object> userData = createUserData("U001", "user1@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails(null, userData);
    }

    @Test
    public void userFactoryRejectsEmptyAccountType() {
        Map<String, Object> userData = createUserData("U001", "user1@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails("", userData);
    }

    @Test
    public void userFactoryRejectsNullMapData() {
        verifyCreateUserFails("Student", null);
    }

    @Test
    public void userFactoryRejectsIncompleteUserData() {
        Map<String, Object> incompleteData = new HashMap<>();
        incompleteData.put("userID", "U001");
        incompleteData.put("orgID", "ADMIN");
        
        // Missing required keys like email and password
        verifyCreateUserFails("Student", incompleteData);
    }
}
