package studylink.models;

public final class Student extends User implements Trackable {
    private String studentIdNumber;

    public Student(int id, String name, String email, String studentIdNumber) {
        super(id, name, email, UserRole.STUDENT, true);
        this.studentIdNumber = studentIdNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("=== PWC Student Dashboard: " + getName() + " ===");
        System.out.println("1. Browse Tutors | 2. Book Session | 3. View Progress");
    }

    @Override
    public void trackProgress() {
        System.out.println("Tracking progress for student ID: " + studentIdNumber);
    }
}
