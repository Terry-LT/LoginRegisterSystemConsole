package user;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserService {
    private final List<User> users = new ArrayList<>();

    public boolean isUserExists(User user){
        return users.contains(user);
    }
    public void updateUser(User user,User updatedUser){
        users.set(users.indexOf(user), updatedUser);
    }
    public void removeUser(User user){
        users.remove(user);
    }
    public void addUser(User user){
        users.add(user);
    }
    public User findUserById(UUID id){
        User foundUser = null;
        for (User user: users) {
            if (user.getId() == id){
                foundUser = user;
            }

        }
        return foundUser;
    }

    public User findUserByUserName(String username){
        User foundUser = null;
        for (User user: users) {
            if (user.getUsername().equals(username)){
                foundUser = user;
            }

        }
        return foundUser;
    }
}
