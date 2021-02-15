package DataStructure;

import java.util.Scanner;

public class Assignment1Q6 {
    public static void main(String[] args) {
        Login obj = new Login();
        String user;
        String pass;
        int loginAttempts = 3;

        Scanner s = new Scanner(System.in);
        while (loginAttempts !=0) {
            System.out.println("Enter UserId: ");
            user = s.nextLine();
            System.out.println("Enter Password: ");
            pass = s.nextLine();

            String loginUser = obj.loginUser(user, pass);
            loginAttempts--;
            System.out.println(loginUser);
        }
        System.out.println("Contact Admin");

    }
}
class Login{
    String userId = "Ajay", password = "password";
    public String loginUser(String user, String pass){
            if (user.equals(userId) && pass.equals(password)) {
                return "Welcome " + user;
            } else
                return "You have entered wrong credentials ,please enter the right credentials.";

    }
}