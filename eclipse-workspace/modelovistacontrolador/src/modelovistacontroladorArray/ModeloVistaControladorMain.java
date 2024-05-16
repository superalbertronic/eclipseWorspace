package modelovistacontroladorArray;

import java.util.ArrayList;
import java.util.Scanner;

public class ModeloVistaControladorMain {
    public static void main(String[] args) {
        Vista vista = new Vista();
        ControladorTareas controlador = new ControladorTareas(vista);

        while (true) {
            vista.mostrarMenu();
            String opcion = vista.obtenerEntrada("Seleccione una opción: ");

            switch (opcion) {
                case "1":
                    controlador.agregarTarea();
                    break;
                case "2":
                    controlador.mostrarListaTareas();
                    break;
                case "3":
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}

