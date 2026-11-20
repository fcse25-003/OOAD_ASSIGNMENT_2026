import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginGUI extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("BANKING SYSTEM LOGIN");

        TextField username = new TextField();
        username.setPromptText("Username");

        PasswordField password = new PasswordField();
        password.setPromptText("Password");

        Button loginButton = new Button("Login");

        VBox root = new VBox(10);

        root.getChildren().addAll(
                title,
                username,
                password,
                loginButton
        );

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Banking System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}  