package scheduler.aigen;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import scheduler.user.User;
import scheduler.user.UserFactory;

public class UserFactoryTest extends TestFileSupport {
    @Before
    public void clearUsersBeforeTest() throws Exception {
        clearUserFactoryCaches();
        writeCsv(scheduler.database.CsvDatabase.ACCOUNTS_FILE,
                "userID,email,password,orgID,accountType,verified");
    }

    @After
    public void clearUsersAfterTest() throws Exception {
        clearUserFactoryCaches();
    }

    @Test
    public void validatesEmailAndStrongPasswordBoundaries() {
        UserFactory factory = new UserFactory();
        assertTrue(factory.isValidEmail("student@yorku.ca"));
        assertFalse(factory.isValidEmail("student@yorku"));
        assertFalse(factory.isValidEmail(null));

        assertTrue(factory.isStrongPassword("Strong1!"));
        assertFalse(factory.isStrongPassword("short1!"));
        assertFalse(factory.isStrongPassword("nouppercase1!"));
        assertFalse(factory.isStrongPassword("NOLOWERCASE1!"));
        assertFalse(factory.isStrongPassword("NoNumber!"));
        assertFalse(factory.isStrongPassword("NoSymbol1"));
    }

    @Test
    public void universityUserVerificationDependsOnYorkEmail() {
        UserFactory factory = new UserFactory();

        User yorkStudent = factory.createUser("student",
                details("s1", "s1@my.yorku.ca", "Strong1!", "YORK"));
        User externalStudent = factory.createUser("student",
                details("s2", "s2@example.com", "Strong1!", "YORK"));
        User partner = factory.createUser("partner",
                details("p1", "partner@example.com", "Strong1!", "EXT"));

        assertTrue(yorkStudent.isVerified());
        assertFalse(externalStudent.isVerified());
        assertTrue(partner.isVerified());
        assertSame(yorkStudent, factory.getUserByID("S1"));
        assertSame(partner, factory.getUserByEmail("PARTNER@EXAMPLE.COM"));
    }

    @Test
    public void duplicateIdsAndEmailsAreRejectedCaseInsensitively() {
        UserFactory factory = new UserFactory();
        factory.createUser("student", details("s1", "one@yorku.ca", "Strong1!", "YORK"));

        assertThrows(IllegalArgumentException.class,
                () -> factory.createUser("faculty", details("S1", "two@yorku.ca", "Strong1!", "YORK")));
        assertThrows(IllegalArgumentException.class,
                () -> factory.createUser("staff", details("s2", "ONE@YORKU.CA", "Strong1!", "YORK")));
    }

    @Test
    public void unsupportedTypeAndMissingDetailsAreRejected() {
        UserFactory factory = new UserFactory();
        assertThrows(IllegalArgumentException.class, () -> factory.createUser(null, details("x", "x@yorku.ca", "Strong1!", "Y")));
        assertThrows(IllegalArgumentException.class, () -> factory.createUser("student", null));
        assertThrows(IllegalArgumentException.class, () -> factory.createUser("guest", details("x", "x@example.com", "Strong1!", "X")));
        assertThrows(IllegalArgumentException.class, () -> factory.createUser("student", details("x", "bad", "Strong1!", "Y")));
        assertThrows(IllegalArgumentException.class, () -> factory.createUser("student", details("x", "x@yorku.ca", "weak", "Y")));
    }

    private Map<String, Object> details(String id, String email, String password, String org) {
        Map<String, Object> values = new HashMap<>();
        values.put("userID", id);
        values.put("email", email);
        values.put("password", password);
        values.put("orgID", org);
        return values;
    }

    @SuppressWarnings("unchecked")
    private void clearUserFactoryCaches() throws Exception {
        for (String fieldName : new String[] {"usersByID", "usersByEmail"}) {
            Field field = UserFactory.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            ((Map<String, User>) field.get(null)).clear();
        }
    }
}
