package scheduler.database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public final class CsvDatabase {

    public static final Path ACCOUNTS_FILE = Path.of("accounts.csv");
    public static final Path BOOKINGS_FILE = Path.of("bookings.csv");
    public static final Path ROOMS_FILE = Path.of("rooms.csv");

    private CsvDatabase() {
    }

    public static synchronized List<String[]> read(Path file) {
        List<String[]> rows = new ArrayList<>();

        if (!Files.exists(file)) {
            return rows;
        }

        try {
            List<String> lines = Files.readAllLines(file);

            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i).trim();

                if (!line.isEmpty()) {
                    rows.add(line.split(",", -1));
                }
            }
        } catch (IOException exception) {
            throw new IllegalStateException(
                    "Could not read CSV file: " + file, exception);
        }

        return rows;
    }

    public static synchronized void append(Path file, String row) {
        try {
            Files.writeString(
                    file,
                    System.lineSeparator() + row,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException exception) {
            throw new IllegalStateException(
                    "Could not write to CSV file: " + file, exception);
        }
    }

    public static synchronized void replaceRows(
            Path file,
            String header,
            List<String> rows) {

        List<String> contents = new ArrayList<>();
        contents.add(header);
        contents.addAll(rows);

        try {
            Files.write(
                    file,
                    contents,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException exception) {
            throw new IllegalStateException(
                    "Could not update CSV file: " + file, exception);
        }
    }

    public static String clean(String value) {
        if (value == null) {
            return "";
        }
        return value.replace(",", " ").trim();
    }
}