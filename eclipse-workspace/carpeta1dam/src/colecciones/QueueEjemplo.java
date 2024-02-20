package colecciones;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEjemplo {
    public static void main(String[] args) {
        // crear una cola
      
    	Queue<String> cola = new LinkedList<>();

        // agregar elementos a la cola
        cola.add("Blanco");
        cola.add("Verde");
        cola.add("Azul");
        cola.add("Amarillo");
        System.out.println("los colores son "+cola);
        // obtener el primer elemento de la cola
        String primerElemento = cola.peek();
        System.out.println("El primer color es: " + primerElemento);
        
        // eliminar un elemento de la cola
        String elementoEliminado = cola.remove();
        System.out.println("El color eliminado es: " + elementoEliminado);
        
        // mostrar todos los elementos de la cola
        System.out.println("los colores ahora son "+cola);
        //buscar un valor
        String valor="Azul";
        if (cola.contains(valor)) {
            System.out.println("Se encontró el valor " + valor);
        } else {
            System.out.println("No se encontró el valor " + valor);
        }
        
       // eliminando el último elemento de la cola
        LinkedList<String> lista = new LinkedList<>(cola);
        String ultimoElemento = lista.getLast();   
        cola.remove(ultimoElemento);
        
        //elimina toda la cola
        cola.clear();
        System.out.println("los colores ahora son "+cola);
       
        
        
    }
}
