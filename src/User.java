public class User {
    private  String id;
    private String username;
    private String password;
    private String email;
    private boolean accountStatus;
    private boolean isLecturer;

    public User(String id,String username, String password, String email,Boolean isLecturer) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.isLecturer = isLecturer;
        this.accountStatus = true; // Account is active by default
    }

    // Getters and setters for all attributes
    public String getUsername() {
        return username;
    }
    public boolean getType() {
        return isLecturer;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAccountActive() {
        return accountStatus;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getId() {
        return id;
    }
}