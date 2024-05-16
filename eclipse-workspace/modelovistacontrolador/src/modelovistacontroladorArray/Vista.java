package modelovistacontroladorArray;

import java.util.ArrayList;
import java.util.Scanner;

class Vista {
    public void mostrarMenu() {
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver lista de tareas");
        System.out.println("3. Salir");
    }

    public String obtenerEntrada(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public void mostrarListaTareas(ArrayList<Tarea> tareas) {
        System.out.println("Lista de tareas:");
        for (int i = 0; i < tareas.size(); i++) {
            Tarea tarea = tareas.get(i);
            System.out.println((i + 1) + ".------ " + tarea.getNombre());
        }
    }
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}