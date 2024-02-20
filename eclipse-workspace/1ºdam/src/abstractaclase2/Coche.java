package abstractaclase2;

public class Coche extends Vehiculo{

	public Coche(String modelo, String color) {
		super(modelo, color);
		// TODO Esbozo de constructor generado automáticamente
	}
    @Override
	public void MostrarDatos() {
		System.out.println(" Su modelo es "+getModelo()+" el color es "+getColor());
	}
	
	
	
}
