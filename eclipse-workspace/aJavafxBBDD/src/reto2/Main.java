package reto2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneBuilderReto.fxml"));
		Parent root = loader.load();

		primaryStage.setTitle("Examen práctico Segundo Trimestre");
		primaryStage.setScene(new Scene(root, 1000, 800));
		primaryStage.show();

		// Mueve la lógica de la base de datos al controlador
		String dbURL = "jdbc:mysql://localhost:/Universidad";
		String dbUser = "root";
		String dbPassword = "";

		try {
			Controller controller = loader.getController();
			controller.inicializar(dbURL, dbUser, dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
