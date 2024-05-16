package examenfinal2T;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.sql.SQLException;
import java.util.List;
import javafx.scene.control.cell.PropertyValueFactory;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Estudiante {
    private IntegerProperty id = new SimpleIntegerProperty();
    private StringProperty nombre = new SimpleStringProperty();
    private StringProperty correo = new SimpleStringProperty();
    private StringProperty telefono = new SimpleStringProperty(); // Cambiado a String
    private StringProperty curso = new SimpleStringProperty();
    private StringProperty fecha = new SimpleStringProperty();

    public Estudiante(int id, String nombre, String correo, String telefono, String curso, String fecha) {
        this.id.set(id);
        this.nombre.set(nombre);
        this.correo.set(correo);
        this.telefono.set(telefono);
        this.curso.set(curso);
        this.fecha.set(fecha);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty NombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getCorreo() {
        return correo.get();
    }

    public StringProperty correoProperty() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo.set(correo);
    }

    public String getTelefono() {
        return telefono.get();
    }

    public StringProperty TelefonoProperty() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono.set(telefono);
    }

    public String getCurso() {
        return curso.get();
    }

    public  StringProperty CursoProperty() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso.set(curso);
    }

    public String getFecha() {
        return fecha.get();
    }

    public  StringProperty FechaProperty() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha.set(fecha);
    }
}
