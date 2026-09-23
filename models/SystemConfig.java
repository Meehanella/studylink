package studylink.models;

public class SystemConfig {
    public static String INSTITUTION_NAME = "Philippine Women's College (PWC)";
    private static int totalAccesses = 0;

    public static void incrementAccess() {
        totalAccesses++;
    }

    // Static Inner Class
    public static class SystemStats {
        public static void printStats() {
            System.out.println("Institution: " + INSTITUTION_NAME);
            System.out.println("Total System Accesses: " + totalAccesses);
        }
    }
}
