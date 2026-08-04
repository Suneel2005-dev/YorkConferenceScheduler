package scheduler.dev;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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

    private String getNextUserId() {
        return "U_" + UUID.randomUUID().toString();
    }

    private String getNextAdminId() {
        return "admin_" + UUID.randomUUID().toString().substring(0, 8);
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
        Map<String, Object> chiefData = createUserData("chief1", "Chief Admin", "chief@yorku.ca", "Chief123!", "ORG001");
        verifyCreateUserFails("ChiefEventCoordinator", chiefData);
    }

    @Test
    public void userFactoryRejectsDirectAdministratorCreation() {
        String adminId = getNextAdminId();
        // Administrator passwords are auto-generated upon creation; null password passed to factory
        Map<String, Object> adminData = createUserData(adminId, "Room Admin 1", adminId + "@yorku.ca", null, "ORG001");
        verifyCreateUserFails("Administrator", adminData);
    }

    @Test
    public void studentRoleIsDistinctFromAdministrator() {
        String uid = getNextUserId();
        Map<String, Object> studentData = createUserData(uid, "Student Bob", "student_" + uid + "@example.com", "Password_1!", "ORG001");
        User student = factory.createUser("Student", studentData);

        assertNotNull(student);
        assertTrue(student instanceof Student);
    }

    @Test
    public void facultyRoleIsDistinctFromAdministrator() {
        String uid = getNextUserId();
        Map<String, Object> facultyData = createUserData(uid, "Prof. Smith", "faculty_" + uid + "@example.com", "Password_1!", "ORG001");
        User faculty = factory.createUser("Faculty", facultyData);

        assertNotNull(faculty);
        assertTrue(faculty instanceof Faculty);
    }

    @Test
    public void staffRoleIsDistinctFromAdministrator() {
        String uid = getNextUserId();
        Map<String, Object> staffData = createUserData(uid, "Staff Member", "staff_" + uid + "@example.com", "Password_1!", "ORG002");
        User staff = factory.createUser("Staff", staffData);

        assertNotNull(staff);
        assertTrue(staff instanceof Staff);
    }

    @Test
    public void partnerRoleIsDistinctFromAdministrator() {
        String uid = getNextUserId();
        Map<String, Object> partnerData = createUserData(uid, "External Partner", "partner_" + uid + "@partner.com", "Password_1!", "ORG002");
        User partner = factory.createUser("Partner", partnerData);

        assertNotNull(partner);
        assertTrue(partner instanceof Partner);
    }

    @Test
    public void userFactoryRejectsUnknownAccountType() {
        String uid = getNextUserId();
        Map<String, Object> userData = createUserData(uid, "Fake Admin", "fake_" + uid + "@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails("SuperAdmin", userData);
    }

    @Test
    public void userFactoryRejectsNullAccountType() {
        String uid = getNextUserId();
        Map<String, Object> userData = createUserData(uid, "Null Role", "null_" + uid + "@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails(null, userData);
    }

    @Test
    public void userFactoryRejectsNullMapData() {
        verifyCreateUserFails("Student", null);
    }

    @Test
    public void userFactoryRejectsIncompleteUserData() {
        String uid = getNextUserId();
        Map<String, Object> incompleteData = new HashMap<>();
        incompleteData.put("userID", uid);
        incompleteData.put("orgID", "ORG001");
        incompleteData.put("name", "Incomplete User");
        verifyCreateUserFails("Student", incompleteData);
    }
}
