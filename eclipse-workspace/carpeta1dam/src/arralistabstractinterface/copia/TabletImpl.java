package arralistabstractinterface.copia;

public class TabletImpl extends ProductoInformatico implements Tablet {
    private int tamanoPantalla;
    private boolean Wifi;

    public TabletImpl(String nombre, double precio, int tamanoPantalla, boolean Wifi) {
        super(nombre, precio);
        this.tamanoPantalla = tamanoPantalla;
        this.Wifi = Wifi;
    }

    public boolean Wifi() {
        return Wifi;
    }

    public String getDescripcion() {
        return "Tablet " + getNombre() + " de " + tamanoPantalla + " pulgadas, " + 
    (Wifi ? "con" : "sin") + " wifi, precio: " + getPrecio();
    }
    @Override
    public void agregarACarrito() {
        super.agregarACarrito();
        System.out.println("Recibirá un estuche de cuero gratis con su compra de tablet.");
    }

	@Override
	public int getTamanoPantalla() {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}
}