package scheduler.aigen;

import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;

import scheduler.database.CsvDatabase;

/** Keeps integration tests from permanently changing the application's CSV files. */
public abstract class TestFileSupport {
    private final Map<Path, byte[]> snapshots = new HashMap<>();
    private final Map<Path, Boolean> existed = new HashMap<>();

    @Before
    public void snapshotCsvFiles() throws IOException {
        snapshot(CsvDatabase.ACCOUNTS_FILE);
        snapshot(CsvDatabase.ROOMS_FILE);
        snapshot(CsvDatabase.BOOKINGS_FILE);
    }

    @After
    public void restoreCsvFiles() throws IOException {
        for (Path file : snapshots.keySet()) {
            if (existed.get(file)) {
                Files.write(file, snapshots.get(file));
            } else {
                Files.deleteIfExists(file);
            }
        }
    }

    protected void writeCsv(Path file, String... lines) throws IOException {
        Files.write(file, java.util.Arrays.asList(lines));
    }

    protected void assertCsvEquals(Path file, String... expected) throws IOException {
        assertArrayEquals(expected, Files.readAllLines(file).toArray(new String[0]));
    }

    private void snapshot(Path file) throws IOException {
        existed.put(file, Files.exists(file));
        snapshots.put(file, Files.exists(file) ? Files.readAllBytes(file) : new byte[0]);
    }
}
