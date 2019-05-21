package agenda.model.base;

public class User {
    private String username;
    private String password;
    private String name;

    public User(String name, String username, String password) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("#");
        sb.append(username);
        sb.append("#");
        sb.append(password);
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) return false;
        User u = (User) obj;
        if (u.name.equals(name) && u.username.equals(username) && u.password.equals(password)) return true;
        return false;
    }
}
