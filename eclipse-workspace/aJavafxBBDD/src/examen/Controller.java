package examen;

import java.sql.SQLException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	TextField campoNombre;

	@FXML
	TextField campoFecha;

	@FXML
	TextField campoCorreo;

	@FXML
	TextField campoTelefono;

	@FXML
	TextField campoCurso;

	@FXML
	TableView<Estudiante> tablaEstudiantes;

	@FXML
	TableColumn<Estudiante, String> columnaNombre;

	@FXML
	TableColumn<Estudiante, String> columnaCorreo;

	@FXML
	TableColumn<Estudiante, String> columnaTelefono;

	@FXML
	TableColumn<Estudiante, String> columnaCurso;

	@FXML
	TableColumn<Estudiante, String> columnaFecha;

	@FXML
	Button btn_save;
	@FXML
	Button btn_upd;
	@FXML
	Button btn_del;
	@FXML
	Button btn_show;

	private EstudianteModel model;

	public void initDB(String dbURL, String username, String password) throws SQLException {
		model = new EstudianteModel(dbURL, username, password);
		columnaNombre.setCellValueFactory(cellData -> cellData.getValue().getNombre());
		columnaCorreo.setCellValueFactory(cellData -> cellData.getValue().getCorreo());
		columnaTelefono.setCellValueFactory(cellData -> cellData.getValue().getTelefono());
		columnaCurso.setCellValueFactory(cellData -> cellData.getValue().getCurso());
		columnaFecha.setCellValueFactory(cellData -> cellData.getValue().getFecha());
		
	}

	private void loadItems() throws SQLException {
		tablaEstudiantes.getItems().clear();
		List<Estudiante> items = model.getAllItems();
		tablaEstudiantes.getItems().addAll(items);
	}

	@FXML
	public void btn_save() throws SQLException {
		model.addToDB(campoNombre.getText().toString(), campoCorreo.getText().toString(), campoTelefono.getText().toString(), 
				campoCurso.getText().toString(),campoFecha.getText().toString());
	}


	@FXML
	public void btn_delete() throws SQLException {
		model.deleteInDB(campoNombre.getText());
		loadItems();
	}
	
	@FXML
	public void btn_show() throws SQLException {
		loadItems();
	}
}
