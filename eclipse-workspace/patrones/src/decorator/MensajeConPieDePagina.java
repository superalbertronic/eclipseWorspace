package decorator;

class MensajeConPieDePagina implements Mensaje {
    private Mensaje mensaje;
    private String pieDePagina;

    public MensajeConPieDePagina(Mensaje mensaje, String pieDePagina) {
        this.mensaje = mensaje;
        this.pieDePagina = pieDePagina;
    }

    @Override
    public String obtenerContenido() {
        return mensaje.obtenerContenido() + "\n" + pieDePagina;
    }
}
