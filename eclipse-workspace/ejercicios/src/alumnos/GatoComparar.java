package alumnos;

class GatoComparar implements Comparable<GatoComparar> {
    private String nombre;
    private String color;
    private String raza;
    private int edad;
    private String tamano;

    public GatoComparar(String nombre, String color, String raza, int edad, String tamano) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Gato: " + nombre + ", color: " + color + ", raza: " + raza + ", edad: " + edad + ", tamaño: " + tamano;
    }

    @Override
    public int compareTo(GatoComparar otroGato) {
        return this.nombre.compareTo(otroGato.nombre);
    }
}