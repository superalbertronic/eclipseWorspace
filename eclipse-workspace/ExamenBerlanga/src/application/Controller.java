package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Controller {

    private final String url = "jdbc:mysql://localhost/universidad";
    private final String user = "root";
    private final String password = "";

    @FXML
    private TextField nombreTextField;
    @FXML
    private TextField correoElectronicoTextField;
    @FXML
    private TextField telefonoTextField;
    @FXML
    private TextField cursoTextField;
    @FXML
    private TableColumn<Estudiante, Date> fechaColumn;
    @FXML
    private TableView<Estudiante> estudiantesTableView;
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

    private ObservableList<Estudiante> estudiantesData = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        correoElectronicoColumn.setCellValueFactory(new PropertyValueFactory<>("correoElectronico"));
        telefonoColumn.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        cursoColumn.setCellValueFactory(new PropertyValueFactory<>("curso"));

        estudiantesTableView.setItems(estudiantesData);
    }

    @FXML
    private void addEstudiante() {
        String sql = "INSERT INTO Estudiantes (nombre, correo_electronico, telefono, curso, fecha_inscripcion) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombreTextField.getText());
            pstmt.setString(2, correoElectronicoTextField.getText());
            pstmt.setString(3, telefonoTextField.getText());
            pstmt.setString(4, cursoTextField.getText());

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                refreshEstudiantes();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showEstudiantes() {
        estudiantesData.clear();
        String sql = "SELECT * FROM Estudiantes";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                estudiantesData.add(new Estudiante(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("correo_electronico"),
                        rs.getString("telefono"),
                        rs.getString("curso"),
                        rs.getDate("fecha_inscripcion")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void deleteEstudiante() {
        String sql = "DELETE FROM Estudiantes WHERE nombre = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombreTextField.getText());

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                refreshEstudiantes();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void refreshEstudiantes() {
        showEstudiantes();
    }
    
}

