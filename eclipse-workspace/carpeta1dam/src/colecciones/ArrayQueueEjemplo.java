package colecciones;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayQueueEjemplo {
    public static void main(String[] args) {
        Queue<Integer> arrayQueue = new ArrayDeque<>();
        arrayQueue.add(1);
        arrayQueue.add(2);
        arrayQueue.add(3);

        System.out.println("ArrayQueue: " + arrayQueue);

        int firstElement = arrayQueue.poll();
        System.out.println("Primer elemento: " + firstElement);

        System.out.println("ArrayQueue después de remover el primer elemento: " + arrayQueue);
    }
}
