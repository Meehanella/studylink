package studylink.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SupabaseConnector {
    private static final String URL = "jdbc:postgresql://db.YOUR_PROJECT_REF.supabase.co:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "YOUR_SUPABASE_DB_PASSWORD";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());
            return null;
        }
    }
}
