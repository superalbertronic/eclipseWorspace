package decorator;

class MensajeConEncabezado implements Mensaje {
    private Mensaje mensaje;
    private String encabezado;

    public MensajeConEncabezado(Mensaje mensaje, String encabezado) {
        this.mensaje = mensaje;
        this.encabezado = encabezado;
    }

    @Override
    public String obtenerContenido() {
        return encabezado + "\n" + mensaje.obtenerContenido();
    }
}
