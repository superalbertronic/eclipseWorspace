package arralistabstractinterface.copia;

public class PortatilImpl extends ProductoInformatico implements Portatil {
    private int tamanoPantalla;

    public PortatilImpl(String nombre, double precio, int tamanoPantalla) {
        super(nombre, precio);
        this.tamanoPantalla = tamanoPantalla;
    }

    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}

	public String getDescripcion() {
        return "Portatil " + getNombre() + " de " + tamanoPantalla + " pulgadas, precio: " + precio;
    }
	@Override
    public void agregarACarrito() {
        super.agregarACarrito();
        System.out.println("Recibirá un descuento del 5% en su próxima compra de portátil.");
    }
	
}