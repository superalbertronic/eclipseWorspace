package decorator2;

public class Main {
    public static void main(String[] args) {
        Compra compra = new CompraBasica("Gracias por la compra de su coche");

        // Decorar el mensaje con un encabezado y un pie de página
        Compra mensajeDecorado = 
                new CompraConExtras(compra, 
                        "¡¡¡¡Su coche tiene varios extras!!!");

        System.out.println(mensajeDecorado.obtenerContenido());
    }

	
}
