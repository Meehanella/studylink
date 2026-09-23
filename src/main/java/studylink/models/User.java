package studylink.models;

public abstract class User implements Authenticatable {
    private int id;
    private String name;
    private String email;
    private UserRole role;
    protected boolean isActive;

    // Constructor chaining using 'this'
    public User(String name, String email, UserRole role) {
        this(0, name, email, role, true);
    }

    public User(int id, String name, String email, UserRole role, boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.isActive = isActive;
    }

    // Encapsulation Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public UserRole getRole() { return role; }
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { this.isActive = active; }

    public abstract void displayDashboard();

    @Override
    public boolean login(String inputEmail, String inputPassword) {
        return this.email.equalsIgnoreCase(inputEmail);
    }

    @Override
    public void logout() {
        System.out.println(this.name + " has logged out.");
    }
}
