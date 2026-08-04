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
    public void userFactoryRejectsDirectChiefCoordinatorCreation() {
        Map<String, Object> chiefData = createUserData("chief101", "Chief Admin", "chief101@yorku.ca", "Chief123!", "ORG001");
        verifyCreateUserFails("ChiefEventCoordinator", chiefData);
    }

    @Test
    public void userFactoryRejectsDirectAdministratorCreation() {
        // Administrator passwords are auto-generated upon creation; null password passed
        Map<String, Object> adminData = createUserData("admin101", "Room Admin 1", "admin101@yorku.ca", null, "ORG001");
        verifyCreateUserFails("Administrator", adminData);
    }

    @Test
    public void studentRoleIsDistinctFromAdministrator() {
        Map<String, Object> studentData = createUserData("U201", "Student Bob", "student201@example.com", "Password_1!", "ORG001");
        User student = factory.createUser("Student", studentData);

        assertNotNull(student);
        assertTrue(student instanceof Student);
    }

    @Test
    public void facultyRoleIsDistinctFromAdministrator() {
        Map<String, Object> facultyData = createUserData("U202", "Prof. Smith", "faculty202@example.com", "Password_1!", "ORG001");
        User faculty = factory.createUser("Faculty", facultyData);

        assertNotNull(faculty);
        assertTrue(faculty instanceof Faculty);
    }

    @Test
    public void staffRoleIsDistinctFromAdministrator() {
        Map<String, Object> staffData = createUserData("U203", "Staff Member", "staff203@example.com", "Password_1!", "ORG002");
        User staff = factory.createUser("Staff", staffData);

        assertNotNull(staff);
        assertTrue(staff instanceof Staff);
    }

    @Test
    public void partnerRoleIsDistinctFromAdministrator() {
        Map<String, Object> partnerData = createUserData("U204", "External Partner", "partner204@partner.com", "Password_1!", "ORG002");
        User partner = factory.createUser("Partner", partnerData);

        assertNotNull(partner);
        assertTrue(partner instanceof Partner);
    }

    @Test
    public void userFactoryRejectsUnknownAccountType() {
        Map<String, Object> userData = createUserData("U205", "Fake Admin", "fake205@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails("SuperAdmin", userData);
    }

    @Test
    public void userFactoryRejectsNullAccountType() {
        Map<String, Object> userData = createUserData("U206", "Null Role", "null206@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails(null, userData);
    }

    @Test
    public void userFactoryRejectsNullMapData() {
        verifyCreateUserFails("Student", null);
    }

    @Test
    public void userFactoryRejectsIncompleteUserData() {
        Map<String, Object> incompleteData = new HashMap<>();
        incompleteData.put("userID", "U207");
        incompleteData.put("orgID", "ORG001");
        incompleteData.put("name", "Incomplete User");
        verifyCreateUserFails("Student", incompleteData);
    }
}
