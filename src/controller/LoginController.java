package controller;

public class LoginController {

    public boolean login(String username, String password) {

        if(username.equals("admin")
                && password.equals("1234")) {

            System.out.println("Login Successful");
            return true;
        }

        System.out.println("Invalid Username or Password");
        return false;
    }
}
