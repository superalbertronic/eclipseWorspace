package valoresconobjetosparcial;

public class ProfesorFactorizado {
   private DetalleProfesorFactorizado detalles;

    public ProfesorFactorizado(DetalleProfesorFactorizado detalles) {
        this.detalles = detalles;
         }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + detalles.getNombre());
        System.out.println("curso: " + detalles.getCurso());
        System.out.println("Asignatura: " + detalles.getAsignatura());
        System.out.println("Salario: " + detalles.getSalario());
    }
}