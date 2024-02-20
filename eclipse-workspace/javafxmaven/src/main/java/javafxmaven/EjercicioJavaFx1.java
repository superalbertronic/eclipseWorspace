package javafxmaven;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class EjercicioJavaFx1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello JavaFX");
        StackPane root = new StackPane();
        root.getChildren().add(new javafx.scene.control.Label("Hello JavaFX!"));
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }
}