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
    public void existingStudentEmailUser1IsRejectedAsDuplicate() {
        Map<String, Object> duplicateData = createUserData("U001", "user1@example.com", "Password_1!", "ORG001");
        verifyCreateUserFails("Student", duplicateData);
    }

    @Test
    public void existingFacultyEmailUser2IsRejectedAsDuplicate() {
        Map<String, Object> duplicateData = createUserData("U002", "user2@example.com", "Password_2!", "ORG001");
        verifyCreateUserFails("Faculty", duplicateData);
    }

    @Test
    public void existingStaffEmailUser3IsRejectedAsDuplicate() {
        Map<String, Object> duplicateData = createUserData("U003", "user3@example.com", "Password_3!", "ORG002");
        verifyCreateUserFails("Staff", duplicateData);
    }

    @Test
    public void existingPartnerEmailUser4IsRejectedAsDuplicate() {
        Map<String, Object> duplicateData = createUserData("U004", "user4@example.com", "Password_4!", "ORG002");
        verifyCreateUserFails("Partner", duplicateData);
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
}
