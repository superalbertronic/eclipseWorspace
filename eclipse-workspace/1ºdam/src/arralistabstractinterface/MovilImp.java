package arralistabstractinterface;

public class MovilImp extends ProductoInformatico implements Movil {
    
	private int tamanoPantalla;
    private String operador;

    public MovilImp(String nombre, double precio, int tamanoPantalla, String operador) {
        super(nombre, precio);
        this.tamanoPantalla = tamanoPantalla;
        this.operador = operador;
    }

    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public String getOperador() {
        return operador;
    }
    

    public String Descripcion() {
        return "Movil " + getNombre() + " de " + tamanoPantalla + " pulgadas, operador: " 
    + operador + ", precio: " + getPrecio();
    }
    
    public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}
	@Override
    public void comprarProducto() {
        super.comprarProducto();
        System.out.println("Recibirá un protector de pantalla gratis "
        		+ "con su compra de móvil.");
    }
	
}