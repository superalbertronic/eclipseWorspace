package observer;

public class Main {
    public static void main(String[] args) {
        // Crear el sistema de venta de productos y la barra de estado
        SistemaVentaProductos sistemaVentaProductos = new SistemaVentaProductos();
        BarraEstado barraEstado = new BarraEstado(sistemaVentaProductos);

        // Simular ventas de productos
        sistemaVentaProductos.venderProducto(5);
        sistemaVentaProductos.eliminarObservador(barraEstado);
        sistemaVentaProductos.venderProducto(3);
        sistemaVentaProductos.agregarObservador(barraEstado);
        sistemaVentaProductos.venderProducto(2);
      
      
    }
}
