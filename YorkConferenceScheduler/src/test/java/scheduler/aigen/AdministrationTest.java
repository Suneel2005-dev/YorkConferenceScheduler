package scheduler.aigen;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.Before;
import org.junit.Test;

import scheduler.database.CsvDatabase;
import scheduler.room.AvailableState;
import scheduler.room.MaintenanceState;
import scheduler.user.Administrator;
import scheduler.user.ChiefEventCoordinator;

public class AdministrationTest extends TestFileSupport {
    @Before
    public void createAccountsFile() throws Exception {
        writeCsv(CsvDatabase.ACCOUNTS_FILE,
                "userID,email,password,orgID,accountType,verified",
                "A001,admin@yorku.ca,Admin123!,ADMIN,administrator,true",
                "A002,unverified@yorku.ca,Admin123!,ADMIN,administrator,false",
                "S001,student@yorku.ca,Student1!,YORK,student,true");
    }

    @Test
    public void chiefCoordinatorIsSingletonAndAuthenticatesOnlyConfiguredCredentials() {
        ChiefEventCoordinator first = ChiefEventCoordinator.getInstance();
        ChiefEventCoordinator second = ChiefEventCoordinator.getInstance();
        assertSame(first, second);
        assertTrue(first.authenticate("CHIEF@yorku.ca", "Chief123!"));
        assertFalse(first.authenticate("chief@yorku.ca", "wrong"));
        assertFalse(first.authenticate(null, "Chief123!"));
    }

    @Test
    public void administratorAuthenticationRequiresRolePasswordAndVerification() {
        Administrator admin = Administrator.authenticate("ADMIN@yorku.ca", "Admin123!");
        assertNotNull(admin);
        assertEquals("A001", admin.getAdminID());
        assertNull(Administrator.authenticate("admin@yorku.ca", "wrong"));
        assertNull(Administrator.authenticate("unverified@yorku.ca", "Admin123!"));
        assertNull(Administrator.authenticate("student@yorku.ca", "Student1!"));
    }

    @Test
    public void administratorAddsRoomsAndChangesTheirStates() throws Exception {
        Constructor<Administrator> constructor = Administrator.class.getDeclaredConstructor(String.class, String.class);
        constructor.setAccessible(true);
        Administrator admin = constructor.newInstance("admin@yorku.ca", "A001");

        admin.addRoom("R1", 20, "LAS");
        assertNotNull(admin.getRoom("R1"));
        assertTrue(admin.getRoom("R1").getCurrentState() instanceof AvailableState);
        admin.setRoomState("R1", new MaintenanceState());
        assertTrue(admin.getRoom("R1").isMaintenance());

        assertThrows(IllegalArgumentException.class, () -> admin.addRoom("R1", 20, "LAS"));
        assertThrows(IllegalArgumentException.class, () -> admin.setRoomState("missing", new AvailableState()));
        assertThrows(IllegalArgumentException.class, () -> admin.setRoomState("R1", null));
    }
}
