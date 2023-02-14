import Registration.RegistrationService;
import user.User;

import java.util.Scanner;

public class Main {
    public static User currentUserSession = null;
    public static void main(String[] args) {

        RegistrationService registrationService = new RegistrationService();

        while (true){

            Scanner checkCommand = new Scanner(System.in);
            System.out.print("Type command:");
            String command = checkCommand.nextLine();

            if (command.equals("register") && currentUserSession == null){
                Scanner checkName = new Scanner(System.in);
                System.out.print("Enter username:");
                String username = checkName.nextLine();
                System.out.print("");
                Scanner checkPassword = new Scanner(System.in);
                System.out.print("Enter password:");
                String password = checkPassword.nextLine();
                System.out.print("");
                //Create user
                registrationService.registerUser(username,password);
            }
            if (command.equals("login") && currentUserSession == null){
                Scanner checkName = new Scanner(System.in);
                System.out.print("Enter username:");
                String username = checkName.nextLine();
                System.out.print("");
                Scanner checkPassword = new Scanner(System.in);

                System.out.print("Enter password:");
                String password = checkPassword.nextLine();
                System.out.print("");
                //Login
                User user = registrationService.login(username,password);
                if (user != null){
                    currentUserSession = user;
                    System.out.println("You logged in as "+currentUserSession.getUsername());
                }
                else{
                    System.out.println("The username or password is incorrect");
                }
            }
            if (command.equals("logout")){
                currentUserSession = null;
                System.out.println("You have been logout!");
            }

        }
    }
}
