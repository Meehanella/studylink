package studylink.services;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger {
    public static void logActivity(String action) {
        try (FileWriter writer = new FileWriter("studylink_audit.log", true)) {
            writer.write("[" + LocalDateTime.now() + "] " + action + "\n");
        } catch (IOException e) {
            System.err.println("Logging error: " + e.getMessage());
        }
    }
}
