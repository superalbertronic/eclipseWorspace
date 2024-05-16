package decorator2;

class CompraConExtras implements Compra {
    private Compra compra;
    private String encabezado;

    public CompraConExtras(Compra compra, String encabezado) {
        this.compra = compra;
        this.encabezado = encabezado;
    }

    @Override
    public String obtenerContenido() {
        return encabezado + "\n" + compra.obtenerContenido();
    }
}
