package observer;

import java.util.ArrayList;
import java.util.List;

// Clase que representa el sistema de venta de productos
class SistemaVentaProductos {
    // Lista para almacenar los observadores suscritos al sistema
    private List<Observer> observadores = new ArrayList<>();
    // Variable para almacenar el total de ventas realizadas
    private int totalVentas = 0;

    // Método para agregar un observador al sistema
    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    // Método para eliminar un observador del sistema
    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    // Método que simula la venta de un producto
    public void venderProducto(int cantidad) {
        // Incrementa el total de ventas con la cantidad vendida
        totalVentas += cantidad;
        // Notifica a todos los observadores sobre la venta
        notificarObservadores(cantidad);
    }

    // Método privado para notificar a los observadores sobre la venta
    private void notificarObservadores(int cantidadVendida) {
        // Recorre la lista de observadores y llama al método actualizar de cada uno
        for (Observer observador : observadores) {
            // Se pasa la cantidad vendida como parámetro
            observador.actualizar(cantidadVendida);
        }
    }
}
