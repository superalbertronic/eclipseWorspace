package arralistabstractinterface;

public class PortatilImpl extends ProductoInformatico implements Portatil{
    private int tamanoPantalla;

    public PortatilImpl(String nombre, double precio, int 	tamanoPantalla) {
        super(nombre, precio);
        this.tamanoPantalla =tamanoPantalla;
    }

    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(int 
    		tamanoPantalla) {this.tamanoPantalla = 		tamanoPantalla;
	}

	public String Descripcion() {
        return "Portatil " + getNombre() + " de " + tamanoPantalla + " "		
	+ "pulgadas, "+ "precio: " + 
        				precio;
    }
	@Override
    public void comprarProducto() {
        super.comprarProducto();
        System.out.println("Recibirá"
        		+ "un descuento del "
        		+ "5% en su próxima"
        		+ " compra de portátil.");
    }
	
}