package universidad;

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
    private TableColumn<Estudiante, String> correoColumn;

    @FXML
    private TableColumn<Estudiante, String> telefonoColumn;

    @FXML
    private TableColumn<Estudiante, String> cursoColumn;

    @FXML
    private TableColumn<Estudiante, String> fechaInscripcionColumn;

    @FXML
    private TextField nombreTF;

    @FXML
    private TextField correoTF;

    @FXML
    private TextField telefonoTF;

    @FXML
    private TextField cursoTF;

    @FXML
    private DatePicker fechaInscripcionDP;

    private EstudianteModel model;

    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new EstudianteModel(dbURL, dbUser, dbPassword);
     
    }

    @FXML
    private void agregarEstudiante() {
        String nombre = nombreTF.getText();
        String correo = correoTF.getText();
        String telefono = telefonoTF.getText();
        String curso = cursoTF.getText();
        String fechaInscripcion = fechaInscripcionDP.getValue().toString();

        Estudiante nuevoEstudiante = new Estudiante(nombre, correo, telefono, curso, fechaInscripcion);
        try {
            model.insertarEstudiante(nuevoEstudiante);
            mostrarEstudiantes(); // Actualizar la vista
            limpiarCampos();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores
        }
    }

    @FXML
    private void borrarEstudiante() {
        Estudiante estudianteSeleccionado = tableViewEstudiante.getSelectionModel().getSelectedItem();
        if (estudianteSeleccionado != null) {
            try {
                model.borrarEstudiantePorId(estudianteSeleccionado.getId());
                mostrarEstudiantes();
                limpiarCampos();
            } catch (SQLException e) {
                e.printStackTrace();
                // Manejo de errores
            }
        }
    }

    @FXML
    private void mostrarEstudiantes() {
    	nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
    	correoColumn.setCellValueFactory(cellData -> cellData.getValue().correoProperty());
    	telefonoColumn.setCellValueFactory(cellData -> cellData.getValue().telefonoProperty());
    	cursoColumn.setCellValueFactory(cellData -> cellData.getValue().cursoProperty());
    	fechaInscripcionColumn.setCellValueFactory(cellData -> cellData.getValue().fechaInscripcionProperty());
        tableViewEstudiante.getItems().clear();
        try {
            List<Estudiante> estudiantes = model.getAllEstudiantes();
            tableViewEstudiante.setItems(FXCollections.observableArrayList(estudiantes));
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores
        }
    }

    private void limpiarCampos() {
        nombreTF.clear();
        correoTF.clear();
        telefonoTF.clear();
        cursoTF.clear();
        fechaInscripcionDP.setValue(null);
    }

    @FXML
    private void cerrarConexion() {
        try {
            model.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores
        }
    }
}

