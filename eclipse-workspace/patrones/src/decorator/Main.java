package decorator;

public class Main {
    public static void main(String[] args) {
        Mensaje mensaje = new MensajeBasico("¡Hola, mundo!");

        // Decorar el mensaje con un encabezado y un pie de página
        Mensaje mensajeDecorado = new MensajeConResumen(
                new MensajeConEncabezado(
                    new MensajeConPieDePagina(mensaje, 
                        "Saludos desde mi programa."),
                    "Mensaje importante:"
                ),
                "Resumen del mensaje:"
            );

        System.out.println(mensajeDecorado.obtenerContenido());
    }

	
}
