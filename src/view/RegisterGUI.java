import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegisterGUI extends Application {

    @Override
    public void start(Stage stage) {

        TextField firstName = new TextField();
        firstName.setPromptText("First Name");

        TextField surname = new TextField();
        surname.setPromptText("Surname");

        TextField address = new TextField();
        address.setPromptText("Address");

        TextField phone = new TextField();
        phone.setPromptText("Phone Number");

        Button registerButton = new Button("Register");

        VBox root = new VBox(10);
        root.getChildren().addAll(
                firstName,
                surname,
                address,
                phone,
                registerButton
        );

        Scene scene = new Scene(root, 350, 250);

        stage.setTitle("Customer Registration");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}