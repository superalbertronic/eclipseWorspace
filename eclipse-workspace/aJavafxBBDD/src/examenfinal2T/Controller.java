package examenfinal2T;

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
    private TableColumn<Estudiante, String> correoColumn;

    @FXML
    private TableColumn<Estudiante, String> telefonoColumn; // Cambiado a String

    @FXML
    private TableColumn<Estudiante, String> cursoColumn;

    @FXML
    private TableColumn<Estudiante, String> fechaColumn;

    @FXML
    private TextField tituloTF;

    @FXML
    private TextField autorTF;
    @FXML
    private TextField correoTF;
    @FXML
    private TextField fechaTF;

    @FXML
    private TextField paginasTF;
    
    @FXML
    private TextField cursoTF;
    
    @FXML
    private TextField telefonoTF;

    @FXML
    private Button btnAñadir;

    @FXML
    private Button btnBorrar;

    private EstudianteModel model;

    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        model = new EstudianteModel(dbURL, dbUser, dbPassword);

        btnAñadir.setOnAction(event -> agregarEstudiante());

        mostrarRegistros();
    }

    @FXML
    private void mostrarRegistros() {
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().NombreProperty());
        correoColumn.setCellValueFactory(cellData -> cellData.getValue().correoProperty());
        telefonoColumn.setCellValueFactory(cellData -> cellData.getValue().TelefonoProperty());
        cursoColumn.setCellValueFactory(cellData -> cellData.getValue().CursoProperty());
        fechaColumn.setCellValueFactory(cellData -> cellData.getValue().FechaProperty());

        tableViewEstudiante.getItems().clear();

        try {
            List<Estudiante> estudiantes = model.getAllEstudiantes();
            tableViewEstudiante.getItems().addAll(estudiantes);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void limpiarCampos() {
        tituloTF.clear();
        autorTF.clear();
        paginasTF.clear();
    }

    @FXML
    private void agregarEstudiante() {
        try {
            String nombre = tituloTF.getText();
            String correo = correoTF.getText();
            String telefono = telefonoTF.getText();
            String curso = cursoTF.getText();
            String fecha = fechaTF.getText();

            Estudiante nuevoEstudiante = new Estudiante(0, nombre, correo, telefono, curso, fecha);
            model.agregarEstudiante(nuevoEstudiante);

            String mensaje = "Estudiante añadido:\n" + "Nombre: " + nombre + "\n" + "Correo: " + correo + "\n"
                    + "Teléfono: " + telefono + "\n" + "Curso: " + curso + "\n" + "Fecha: " + fecha;

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Estudiante Añadido");
            alert.setHeaderText(null);
            alert.setContentText(mensaje);
            alert.showAndWait();

            mostrarRegistros();
            limpiarCampos();
        } catch (SQLException | NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error al añadir estudiante");
            alert.setHeaderText("Error");
            alert.setContentText("Por favor, asegúrate de completar correctamente todos los campos.");
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
                alert.setTitle("Estudiante Eliminado");
                alert.setHeaderText(null);
                alert.setContentText("El estudiante seleccionado ha sido eliminado.");
                alert.showAndWait();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("No se ha seleccionado ningún estudiante");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, selecciona un estudiante para eliminar.");
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
