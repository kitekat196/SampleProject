package Lesson8.Application;

public class User {
    private String login;
    private String password;
    private String FullName;

    @Override
    public String toString() {
        return "Login - " + login + "\n" +
                "Password - " + password + "\n"+
                "FullName - " + FullName + "\n\n";
    }

    public User(String login, String password, String fullName) {
        this.login = login;
        this.password = password;
        FullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return FullName;
    }
}
