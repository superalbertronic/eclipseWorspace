package abstractavehiculo3;

public class Moto extends Vehiculo{

	public Moto(String modelo, String color,String motor) {
		super(modelo, color,motor);
		// TODO Esbozo de constructor generado automáticamente
	}
	@Override
	public void MostrarDatos() {
		   System.out.println(" El modelo de la moto es "+getModelo()+ " el color es "+getColor());
		   System.out.println("Gracias por comprar la motomami");
	   
	}
	@Override 
	public void Gracias() {
		super.Gracias();
		System.out.println("Esperamos que su próximo motocicleta, lo compre con nosostros");
		
	}
	
	
}