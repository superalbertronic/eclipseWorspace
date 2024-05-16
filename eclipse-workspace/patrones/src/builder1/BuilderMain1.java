package builder1;



public class BuilderMain1 {
 public static void main(String[] args) {
     // Usando el Builder para construir un Producto
     Producto producto = new ProductoBuilder()
                             .nombre("Camiseta")
                             .descripcion("Camiseta de Star Trek")
                             .precio(20.0)
                             .fabricante("Microsoft")
                             .stock(30)
                             .build();

     // Imprimir detalles del producto
     producto.imprimirDetalles();
 }
}
