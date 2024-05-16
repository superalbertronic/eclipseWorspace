package ParcialInterfacesJoseMartinMartinez;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.sql.SQLException;
import java.util.List;

public class Controller {

	@FXML
	private TableView<Estudiante> tableViewEstudiante;

	@FXML
	private TableColumn<Estudiante, String> nombreColumn;

	@FXML
	private TableColumn<Estudiante, String> correo_electronicoColumn;

	@FXML
	private TableColumn<Estudiante, String> telefonoColumn;

	@FXML
	private TableColumn<Estudiante, Integer> cursoColumn;

	@FXML
	private TextField nombreTF;

	@FXML
	private ChoiceBox<String> correo_electronicoCB;

	@FXML
	private TextField telefonoTF;

	@FXML
	private TextField cursoTF;

	@FXML
	private Button btnAñadir;

	@FXML
	private Button btnBorrar;

	private EstudianteModel model;

	public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
		model = new EstudianteModel(dbURL, dbUser, dbPassword);

		btnAñadir.setOnAction(event -> agregarEstudiante());

		cargarcorreo_electronicoes();
		mostrarEstudiante();
	}

	private void cargarcorreo_electronicoes() {
		List<String> correo_electronicoes = List.of("Planeta", "B de Block", "Debolsillo", "Penguin", "Salamandra");

		correo_electronicoCB.setItems(FXCollections.observableArrayList(correo_electronicoes));
	}

	private void mostrarEstudiante() throws SQLException {
		tableViewEstudiante.getItems().clear();

		List<Estudiante> Estudiante = model.getAllEstudiantes();

		tableViewEstudiante.getItems().addAll(Estudiante);
	}

	@FXML
	private void agregarEstudiante() {
		String nombre = nombreTF.getText();
		String correo_electronico = correo_electronicoCB.getValue();
		String telefono = telefonoTF.getText();
		int curso = Integer.parseInt(cursoTF.getText());

		Estudiante nuevoEstudiante = new Estudiante(0, nombre, correo_electronico, telefono, curso);
		try {
			model.agregarEstudiante(nuevoEstudiante);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String mensaje = "Estudiante añadido:\n" + "nombre: " + nombre + "\n" + "correo_electronico: " + correo_electronico + "\n" + "telefono: "
				+ telefono + "\n" + "Páginas: " + curso;

		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Estudiante Añadido");
		alert.setHeaderText(null);
		alert.setContentText(mensaje);
		alert.showAndWait();

		mostrarRegistros();
		limpiarCampos();
	}

	private void limpiarCampos() {
		nombreTF.clear();
		correo_electronicoCB.setValue(null);
		telefonoTF.clear();
		cursoTF.clear();
	}

	@FXML
	private void borrarRegistro() {
		String nombreEstudiante = nombreTF.getText();
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

        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        correo_electronicoColumn.setCellValueFactory(cellData -> cellData.getValue().correo_electronicoProperty());
        telefonoColumn.setCellValueFactory(cellData -> cellData.getValue().telefonoProperty());
        cursoColumn.setCellValueFactory(cellData -> cellData.getValue().cursoProperty().asObject());

        
        tableViewEstudiante.getItems().clear();

        try {
            List<Estudiante> Estudiante = model.getAllEstudiantes();

           
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
