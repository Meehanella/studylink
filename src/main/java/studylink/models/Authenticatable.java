package studylink.models;

public interface Authenticatable {
    boolean login(String email, String password);
    void logout();
}
