package colecciones;

import java.util.Stack;
public class StackEjemplo {
    public static void main(String[] args) {
        // crear una pila
        Stack<String> pila = new Stack<>();
        // agregar elementos a la pila
        pila.push("Teclado");
        pila.push("Portatil");
        pila.push("Impresora");
        pila.push("Tablet");
        pila.push("Móvil");
        // obtener el elemento superior de la pila
        String elementoSuperior = pila.peek();
        System.out.println("El elemento superior es(peek): " + elementoSuperior);
        // eliminar un elemento de la pila
        String elementoEliminado = pila.pop();
        System.out.println("El elemento eliminado es: (pop)" + elementoEliminado);
        // mostrar todos los elementos de la pila
        for (String elemento : pila) {
            System.out.println("Elemento: " + elemento);
        }
        //proceso de borrado
        while (pila.empty()==false) {
            String elemento = pila.pop();
            System.out.println("Elemento borrado: " + elemento);
           
        }
     
    }
}