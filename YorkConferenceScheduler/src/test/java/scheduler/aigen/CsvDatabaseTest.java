package scheduler.aigen;

import static org.junit.Assert.*;
import java.nio.file.*;
import java.util.*;
import org.junit.Test;
import scheduler.database.CsvDatabase;

public class CsvDatabaseTest {
    @Test public void readAppendReplaceAndCleanWork() throws Exception {
        Path file = Files.createTempFile("scheduler", ".csv"); Files.delete(file);
        assertTrue(CsvDatabase.read(file).isEmpty());
        CsvDatabase.append(file, "1,A,");
        List<String[]> rows = CsvDatabase.read(file);
        assertEquals(1, rows.size()); assertArrayEquals(new String[]{"1", "A", ""}, rows.get(0));
        CsvDatabase.replaceRows(file, "h1,h2", Arrays.asList("x,y", "", "z,w"));
        rows = CsvDatabase.read(file); assertEquals(2, rows.size()); assertArrayEquals(new String[]{"x","y"}, rows.get(0));
        assertEquals("", CsvDatabase.clean(null)); assertEquals("a b", CsvDatabase.clean(" a,b "));
        Files.deleteIfExists(file);
    }
}
