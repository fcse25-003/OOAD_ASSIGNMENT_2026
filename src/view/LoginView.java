package view;

import controller.LoginController;

public class LoginView {

    private LoginController controller;

    public LoginView() {
        controller = new LoginController();
    }

    public void login(String username, String password) {

        boolean result = controller.login(username, password);

        if(result) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }
}
