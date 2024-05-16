package application5;

import javafx.collections.FXCollections;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.sql.SQLException;
import java.util.List;

public class Controller {

	@FXML
	private TableView<Estudiante> tableViewEstudiante;

	@FXML
	private TableColumn<Estudiante, Integer> idColumn;

	@FXML
	private TableColumn<Estudiante, String> nombreColumn;

	@FXML
	private TableColumn<Estudiante, String> correoElectronicoColumn;
	
	@FXML
	private TableColumn<Estudiante, String> telefonoColumn;
	
	@FXML
	private TableColumn<Estudiante, String> cursoColumn;
	
	@FXML
	private TableColumn<Estudiante, String> inscripcionColumn;


	@FXML
	private TextField edadTF;

	@FXML
	private TextField correoTF;

	@FXML
	private TextField telefonoTF;
	
	@FXML
	private TextField CursoTF;
	
	@FXML
	private TextField NombreTF;
	
	@FXML
	private TextField fechaInscripcionTF;

	@FXML
	private Button btnAñadir;

	@FXML
	private Button btnBorrar;

	private EstudianteModel model;

	public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
		model = new EstudianteModel(dbURL, dbUser, dbPassword);

		btnAñadir.setOnAction(event -> agregarEstudiante());

		//mostrarEstudiante();
	}



	/*private void mostrarEstudiante() throws SQLException {
		tableViewEstudiante.getItems().clear();

		List<Estudiante> Estudiante = model.getAllEstudiantes();

		tableViewEstudiante.getItems().addAll(Estudiante);
	}*/

	@FXML
	private void agregarEstudiante() {
		String nombre = NombreTF.getText();
		String correo_electronico = correoTF.getText();
		String telefono=telefonoTF.getText();
		String curso=CursoTF.getText();
		String fecha_inscripcion=fechaInscripcionTF.getText();
		
		Estudiante nuevoEstudiante = new Estudiante(0, nombre, correo_electronico, telefono, curso,fecha_inscripcion);
		try {
			model.agregarEstudiante(nuevoEstudiante);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String mensaje = "Estudiante añadido:\n" + "Nombre: " + nombre + "\n" + "Correo electrónico: " + correo_electronico + "\n" + "Teléfono: "
				+ telefono + "\n" + "curso: " + curso  + "\n" + "fecha inscripcion" + fecha_inscripcion;

		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Estudiante Añadido");
		alert.setHeaderText(null);
		alert.setContentText(mensaje);
		alert.showAndWait();

		/*mostrarRegistros();*/
		limpiarCampos();
	}

	private void limpiarCampos() {
		NombreTF.clear();
		correoTF.clear();
		telefonoTF.clear();
		CursoTF.clear();
	}

	@FXML
	private void borrarRegistro() {
		String nombreEstudiante = NombreTF.getText();
		try {
			model.borrarRegistro(nombreEstudiante);
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Estudiante borrado");
			alert.setHeaderText(null);
			alert.setContentText("Has borrado el Estudiante " + nombreEstudiante);
			alert.showAndWait();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		limpiarCampos();
	}
	
	@FXML
    private void mostrarRegistros() {

		idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
		nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
		correoElectronicoColumn.setCellValueFactory(cellData -> cellData.getValue().correo_electronicoProperty());
		telefonoColumn.setCellValueFactory(cellData -> cellData.getValue().telefonoProperty());
		cursoColumn.setCellValueFactory(cellData -> cellData.getValue().cursoProperty());
		inscripcionColumn.setCellValueFactory(cellData -> cellData.getValue().fecha_inscripcionProperty());
		
        // Limpiar la TableView antes de cargar nuevos datos
        tableViewEstudiante.getItems().clear();

        try {
            List<Estudiante> Estudiante = model.getAllEstudiantes();

            // Agrega los datos a la TableView
            tableViewEstudiante.getItems().addAll(Estudiante);

        } catch (SQLException e) {
            e.printStackTrace();
        } // catch
    } // fun

	@FXML
	private void cerrarConexion() {
		try {
			model.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}