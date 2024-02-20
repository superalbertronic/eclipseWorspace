package abstractavehiculo3;

public class Bicicleta extends Vehiculo{

	private String tipo;
	
	public Bicicleta(String modelo, String color, String tipo) {
		super(modelo, color, tipo);
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}

	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public void MostrarDatos() {
		System.out.println("El modelo es " + getModelo() + " y el color es " + getColor() + " el tipo es " + getTipo());
	}
	@Override
	public void Gracias() {
		super.Gracias();
		System.out.println("Esperamos que su próxima bici, lo compre con nosostros");
		
	}


}