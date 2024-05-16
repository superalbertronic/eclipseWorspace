package decorator2;

class CompraBasica implements Compra {
    private String contenido;

    public CompraBasica(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String obtenerContenido() {
        return contenido;
    }
}
