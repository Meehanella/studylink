package studylink.main;

import studylink.models.*;
import studylink.services.FileLogger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Welcome to StudyLink (PWC) ===");

        try {
            SystemConfig.incrementAccess();
            
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your PWC email: ");
            String email = scanner.nextLine();

            // Anonymous class handling short-lived behavior
            Authenticatable validator = new Authenticatable() {
                @Override
                public boolean login(String e, String p) {
                    return e.contains("@pwc.edu.ph");
                }
                @Override
                public void logout() {}
            };

            if (!validator.login(email, "")) {
                System.out.println("Access Denied: Must use a valid PWC email!");
                return;
            }

            Student student = new Student(1, name, email, "PWC-2026-001");
            FileLogger.logActivity("Successful login: " + email);

            student.displayDashboard();
            student.trackProgress();
            
            SystemConfig.SystemStats.printStats();

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("System session closed.");
        }
    }
}
