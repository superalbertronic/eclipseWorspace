package examen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("examen.fxml"));
		Parent root = loader.load();
		primaryStage.setTitle("Mi Aplicación JavaFX");
		primaryStage.setScene(new Scene(root, 500, 500));
		primaryStage.show();
		
		 String dbURL = "jdbc:mysql://localhost/universidad";
	     String usurname = "root";
	     String password = "";
	     
	     try {
	            Controller controller = loader.getController();
	            controller.initDB(dbURL, usurname, password);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

	public static void main(String[] args) {
		launch(args);
	}
}
