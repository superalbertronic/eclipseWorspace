/**
 * persona
 * Definición de la clase persona
 * @author Alberto Ruiz
 */



package objetopersona;

class Persona {
    private String nombre;
    private int edad;
    
    // Método getter para el atributo 'nombre'
    public String getNombre() {
        return nombre;
    }
    
    // Método setter para el atributo 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Método getter para el atributo 'edad'
    public int getEdad() {
        return edad;
    }
    
    // Método setter para el atributo 'edad'
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
