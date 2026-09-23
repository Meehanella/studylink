package studylink.models;

public class Tutor extends User {
    private String specialization;

    public Tutor(int id, String name, String email, String specialization) {
        super(id, name, email, UserRole.TUTOR, true);
        this.specialization = specialization;
    }

    @Override
    public void displayDashboard() {
        System.out.println("=== PWC Tutor Dashboard: " + getName() + " (" + specialization + ") ===");
        System.out.println("1. View Bookings | 2. Accept/Reject Bookings");
    }
}
