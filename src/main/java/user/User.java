package user;

import java.util.UUID;

public class User {
    private String username;
    private UUID id;
    private String password;

    public User(String username, UUID id, String password) {
        this.username = username;
        this.id = id;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public UUID getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean auth(String username,String password){
        //TODO: Decrypt password
        return this.username.equals(username) && this.password.equals(password);
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
