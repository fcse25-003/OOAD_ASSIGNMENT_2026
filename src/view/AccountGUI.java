package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccountGUI extends Application {

    @Override
    public void start(Stage stage) {

        Button deposit = new Button("Deposit");
        Button withdraw = new Button("Withdraw");
        Button balance = new Button("View Balance");
        Button exit = new Button("Exit");

        VBox root = new VBox(10);

        root.getChildren().addAll(
                deposit,
                withdraw,
                balance,
                exit
        );

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Account Menu");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}