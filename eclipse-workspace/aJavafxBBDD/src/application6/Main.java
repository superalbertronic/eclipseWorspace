package ParcialInterfacesJoseMartinMartinez;

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

		primaryStage.setTitle("Mi Aplicación JavaFX");
		primaryStage.setScene(new Scene(root, 600, 400));
		primaryStage.show();

		
		String dbURL = "jdbc:mysql://localhost/biblioteca";
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

//Cambie de ordenador y me daban error las dependencias pero el código creo que etá bien
//Fecha Inscripción puede que me de error por el tipo de dato Date
//He usado el css del reto para modificar los colores del texto y botones.