package examenfinal2T;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneFinal.fxml"));
		Parent root = loader.load();

		primaryStage.setTitle("Mi Aplicación JavaFX");
		primaryStage.setScene(new Scene(root, 1000, 500));
		primaryStage.show();

		// Mueve la lógica de la base de datos al controlador
		String dbURL = "jdbc:mysql://localhost/universidad";
		String dbUser = "root";
		String dbPassword = "basket10";

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