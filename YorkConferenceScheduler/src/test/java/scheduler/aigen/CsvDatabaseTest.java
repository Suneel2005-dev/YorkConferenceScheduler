package scheduler.aigen;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import scheduler.database.CsvDatabase;

public class CsvDatabaseTest {
    @Test
    public void missingFileReadsAsEmpty() throws Exception {
        Path file = Files.createTempFile("scheduler-missing", ".csv");
        Files.delete(file);
        assertTrue(CsvDatabase.read(file).isEmpty());
    }

    @Test
    public void readSkipsHeaderAndBlankLinesButPreservesEmptyColumns() throws Exception {
        Path file = Files.createTempFile("scheduler-read", ".csv");
        Files.write(file, Arrays.asList("id,name,note", "1,A,", "", "2,B,x"));

        List<String[]> rows = CsvDatabase.read(file);

        assertEquals(2, rows.size());
        assertArrayEquals(new String[] {"1", "A", ""}, rows.get(0));
        assertArrayEquals(new String[] {"2", "B", "x"}, rows.get(1));
        Files.deleteIfExists(file);
    }

    @Test
    public void appendAndReplaceRowsPersistExpectedContent() throws Exception {
        Path file = Files.createTempFile("scheduler-write", ".csv");
        Files.delete(file);

        CsvDatabase.append(file, "1,A");
        CsvDatabase.replaceRows(file, "id,name", Arrays.asList("2,B", "3,C"));

        assertEquals(Arrays.asList("id,name", "2,B", "3,C"), Files.readAllLines(file));
        Files.deleteIfExists(file);
    }

    @Test
    public void cleanMakesValuesSafeForSimpleCsvStorage() {
        assertEquals("", CsvDatabase.clean(null));
        assertEquals("a b", CsvDatabase.clean(" a,b "));
        assertEquals("plain", CsvDatabase.clean(" plain "));
    }
}
