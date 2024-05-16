package decorator;

class MensajeBasico implements Mensaje {
    private String contenido;

    public MensajeBasico(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String obtenerContenido() {
        return contenido;
    }
}
