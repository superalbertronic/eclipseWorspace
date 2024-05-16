package modelovistacontroladorArray2;

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

    // Modificar tarea
    public void modificarTarea() {
        String nombreTareaModificar = vista.obtenerEntrada("Ingrese el nombre de la tarea a modificar: ");
        String nuevoNombreTarea = vista.obtenerEntrada("Ingrese el nuevo nombre de la tarea: ");
        
        // Buscar la tarea existente por su nombre
        for (Tarea tarea : tareas) {
            if (tarea.getNombre().equals(nombreTareaModificar)) {
                // Modificar los atributos de la tarea según sea necesario
                tarea.setNombre(nuevoNombreTarea);
                vista.mostrarMensaje("Tarea modificada exitosamente.");
                return; // Terminar el método después de encontrar y modificar la tarea
            }
        }
        // Si la tarea no se encuentra, mostrar un mensaje de error
        vista.mostrarMensaje("La tarea '" + nombreTareaModificar + "' no existe.");
    }
    
    // Eliminar tarea
    public void eliminarTarea() {
        String nombreTareaEliminar = vista.obtenerEntrada("Ingrese el nombre de la tarea a eliminar: ");
        
        // Buscar la tarea por su nombre y eliminarla si se encuentra
        for (int i = 0; i < tareas.size(); i++) {
            Tarea tarea = tareas.get(i);
            if (tarea.getNombre().equals(nombreTareaEliminar)) {
                tareas.remove(i); // Eliminar la tarea en la posición i
                vista.mostrarMensaje("Tarea '" + nombreTareaEliminar + "' eliminada.");
                return; // Terminar el método después de eliminar la tarea
            }
        }
        // Si la tarea no se encuentra, mostrar un mensaje de error
        vista.mostrarMensaje("La tarea '" + nombreTareaEliminar + "' no existe.");
    }

    // Mostrar lista de tareas
    public void mostrarListaTareas() {
        vista.mostrarListaTareas(tareas);
    }
}
