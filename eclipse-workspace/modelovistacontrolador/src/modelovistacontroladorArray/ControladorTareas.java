package modelovistacontroladorArray;

import java.util.ArrayList;

class ControladorTareas {
    private ArrayList<Tarea> tareas = new ArrayList<>();
    private Vista vista;

    public ControladorTareas(Vista vista) {
        this.vista = vista;
    }

    // Agregar tarea
    public void agregarTarea() {
        String nombreTarea = vista.obtenerEntrada("Ingrese el nombre de la tarea: ");
        Tarea tarea = new Tarea(nombreTarea);
        tareas.add(tarea);
    }
   
    // Mostrar lista de tareas
    public void mostrarListaTareas() {
        vista.mostrarListaTareas(tareas);
    }
}
