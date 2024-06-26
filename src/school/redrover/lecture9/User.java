package school.redrover.lecture9;

public class User {
    private final String username;
    private String password;
    private String firstName;
    private String lastName;
    private boolean active;

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public User(String username) throws Exception {
        if (username.equals("iPhone")) {
            throw new Exception("Bad username");
        } else {
            this.username = username;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFullName(String fullName) {
        String[] fullNameParts = fullName.split(" ");
        this.firstName = fullNameParts[0];
        this.lastName = fullNameParts[1];
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password is too short");
        } else {
            this.password = password;
        }
    }

    public boolean isPasswordCorrect(String passwordAttempt) {
        return password.equals(passwordAttempt);
    }
}
