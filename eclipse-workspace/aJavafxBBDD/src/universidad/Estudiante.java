package universidad;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Estudiante {
    private int id;
    private StringProperty nombre;
    private StringProperty correo;
    private StringProperty telefono;
    private StringProperty curso;
    private StringProperty fechaInscripcion;

    public Estudiante(String nombre, String correo, String telefono, String curso, String fechaInscripcion) {
        this.nombre = new SimpleStringProperty(nombre);
        this.correo = new SimpleStringProperty(correo);
        this.telefono = new SimpleStringProperty(telefono);
        this.curso = new SimpleStringProperty(curso);
        this.fechaInscripcion = new SimpleStringProperty(fechaInscripcion);
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public StringProperty correoProperty() {
        return correo;
    }

    public String getCorreo() {
        return correo.get();
    }

    public void setCorreo(String correo) {
        this.correo.set(correo);
    }

    public StringProperty telefonoProperty() {
        return telefono;
    }

    public String getTelefono() {
        return telefono.get();
    }

    public void setTelefono(String telefono) {
        this.telefono.set(telefono);
    }

    public StringProperty cursoProperty() {
        return curso;
    }

    public String getCurso() {
        return curso.get();
    }

    public void setCurso(String curso) {
        this.curso.set(curso);
    }

    public StringProperty fechaInscripcionProperty() {
        return fechaInscripcion;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion.get();
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion.set(fechaInscripcion);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", curso='" + curso + '\'' +
                ", fechaInscripcion='" + fechaInscripcion + '\'' +
                '}';
    }
}

