package singleton;

public class EjercicioSinSingleton {
    // Constructor público para permitir la creación de instancias desde fuera de la clase
    public EjercicioSinSingleton() {}

    // Método de ejemplo para mostrar el funcionamiento
    public void mostrarMensaje() {
        System.out.println("¡Ejercicio sin singleton.");
    }

    public static void main(String[] args) {
        // Crear dos instancias del objeto
        EjercicioSinSingleton objeto1 = new EjercicioSinSingleton();
        EjercicioSinSingleton objeto2 = new EjercicioSinSingleton();

        // Usar las instancias para llamar al método mostrarMensaje
        objeto1.mostrarMensaje();
        objeto2.mostrarMensaje();

        // Verificar si son la misma instancia
        if (objeto1 == objeto2) {
            System.out.println("Es la misma instancia"+objeto1+ ""+objeto2);
        } else {
            System.out.println("Son instancias diferentes"+objeto1+" "+objeto2);
        }
    }
}
