package observer;

class BarraEstado implements Observer {
    // Atributo para mantener una referencia al sistema de venta de productos
    private SistemaVentaProductos sistemaVentaProductos;

    // Constructor que toma como parámetro el sistema de venta de productos
    public BarraEstado(SistemaVentaProductos sistemaVentaProductos) {
        // Se guarda una referencia al sistema de venta de productos
        this.sistemaVentaProductos = sistemaVentaProductos;
        // Se agrega esta instancia como observador al sistema de venta de productos
        this.sistemaVentaProductos.agregarObservador(this);
    }

    // Método de la interfaz Observer que se llama cuando se actualiza el estado del observable
    @Override
    public void actualizar(int cantidadVendida) {
        // Se imprime un mensaje indicando que se vendió un producto y se muestra el total de ventas
        System.out.println("Se vendió un producto. Total de ventas: " + cantidadVendida);
    }
}

