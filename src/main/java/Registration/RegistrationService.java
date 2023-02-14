package Registration;

import user.User;
import user.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RegistrationService {
    private final UserService userService = new UserService();
    public User login(String username,String password){
        User user = userService.findUserByUserName(username);
        if (user != null){
            if (user.auth(username,password)){
                return user;
            }
        }
        return null;

    }
    public void registerUser(String username,String password){
        boolean userWasAdded = false;
        if (userService.findUserByUserName(username) == null){

           User user = new User(
                   username,
                   UUID.randomUUID(),
                   password //TODO: Encrupt password
           );

           userService.addUser(user);
           userWasAdded = true;
        }
        if(userService.findUserByUserName(username) != null && !userWasAdded){
            System.out.println("THE USER ALREADY EXISTS!" + userService.findUserByUserName(username));
            System.out.print("");
        }

    }
}
