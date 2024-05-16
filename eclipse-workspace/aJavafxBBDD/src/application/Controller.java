package application;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.sql.SQLException;
import java.util.List;

public class Controller {

	@FXML
	private TableView<Estudiante> tableViewEstudiante;

	@FXML
	private TableColumn<Estudiante, String> idColumn;

	@FXML
	private TableColumn<Estudiante, String> nombreColumn;

	@FXML
	private TableColumn<Estudiante, String> correoColumn;

	@FXML
	private TableColumn<Estudiante, String> telefonoColumn;
	
	@FXML
	private TableColumn<Estudiante, String> cursoColumn;
	
	@FXML
	private TableColumn<Estudiante, String> fechaColumn;

	@FXML
	private TextField nombreTF;

	@FXML
	private TextField edadTF;

	@FXML
	private TextField correoTF;
	
	@FXML
	private TextField telefonoTF;
	
	@FXML
	private TextField cursoTF;

	@FXML
	private Button btnAñadir;

	@FXML
	private Button btnBorrar;
	
	@FXML
	private Button btnActualizar;
	
	@FXML
	private Button btnMostrar;

	private EstudianteModel model;

	public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
		model = new EstudianteModel(dbURL, dbUser, dbPassword);

		btnAñadir.setOnAction(event -> agregarEstudiante());
		
		mostrarRegistros();

	}

	@FXML
	private void mostrarRegistros() {

		nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
		correoColumn.setCellValueFactory(cellData -> cellData.getValue().correoProperty());
		telefonoColumn.setCellValueFactory(cellData -> cellData.getValue().telefonoProperty());
		cursoColumn.setCellValueFactory(cellData -> cellData.getValue().cursoProperty());
		fechaColumn.setCellValueFactory(cellData -> cellData.getValue().fechaProperty());

		// Limpiar la TableView antes de cargar nuevos datos
		tableViewEstudiante.getItems().clear();

		try {
			List<Estudiante> estudiante = model.getAllEstudiantes();

			// Agrega los datos a la TableView
			tableViewEstudiante.getItems().addAll(estudiante);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void limpiarCampos() {
		nombreTF.clear();
		edadTF.clear();
		correoTF.clear();
		telefonoTF.clear();
		cursoTF.clear();
	}

	@FXML
	private void agregarEstudiante() {

		try {
			String nombre = nombreTF.getText();
			String edad = edadTF.getText();
			String correo = correoTF.getText();
			String telefono = telefonoTF.getText();
			String curso = cursoTF.getText();

			Estudiante nuevoEstudiante = new Estudiante(0, nombre, edad, correo, telefono, curso);
			model.agregarEstudiante(nuevoEstudiante);
			String mensaje = "Estudiante añadido:\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad + "\n"
					+ "Correo: " + correo + "\n" + "Telefono: " + telefono+ "Curso: " + curso;

			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Estudiante Añadido");
			alert.setHeaderText(null);
			alert.setContentText(mensaje);
			alert.showAndWait();

			mostrarRegistros();
			limpiarCampos();

		} catch (SQLException e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Error al añadir Estudiante");
			alert.setHeaderText("Error");
			alert.setContentText(
					"Has dejado algún campo sin rellenar o has ingresado un tipo de dato que no corresponde");
			alert.showAndWait();

		} catch (NumberFormatException i) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Error al añadir al estudiante");
			alert.setHeaderText("Error");
			alert.setContentText(
					"Has dejado algún campo sin rellenar o has ingresado un tipo de dato que no corresponde");
			alert.showAndWait();

		}

	}
	
	@FXML
	private void borrarFilaSeleccionada() {
	    Estudiante estudianteSeleccionado = tableViewEstudiante.getSelectionModel().getSelectedItem();

	    if (estudianteSeleccionado != null) {
	        try {
	            model.borrarRegistro(estudianteSeleccionado.getNombre());

	            tableViewEstudiante.getItems().remove(estudianteSeleccionado);

	            limpiarCampos();

	            Alert alert = new Alert(Alert.AlertType.INFORMATION);
	            alert.setTitle("Estudiante borrado");
	            alert.setHeaderText(null);
	            alert.setContentText("Se ha borrado el estudiante seleccionado");
	            alert.showAndWait();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    } else {
	        Alert alert = new Alert(Alert.AlertType.WARNING);
	        alert.setTitle("Error al borrar el estudiante");
	        alert.setHeaderText(null);
	        alert.setContentText("Por favor, selecciona un estudiante para borrar");
	        alert.showAndWait();
	    }
	}

	@FXML
	private void cerrarConexion() {
		try {
			model.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
