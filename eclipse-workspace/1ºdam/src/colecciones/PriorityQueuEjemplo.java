package colecciones;

import java.util.PriorityQueue;

public class PriorityQueuEjemplo {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Rojo");
        priorityQueue.add("Amarillo");
        priorityQueue.add("Azul");

        System.out.println("PriorityQueue: " + priorityQueue);
        //En la clase PriorityQueue de Java, poll() es un método que se utiliza 
        //para obtener y eliminar el primer elemento de la cola (es decir, el elemento con 
        //la prioridad más alta
        String firstElement = priorityQueue.poll();
        System.out.println("Primer elemento: " + firstElement);

        System.out.println("PriorityQueue después de remover el primer elemento: " + priorityQueue);
        
        
        
    }
}
