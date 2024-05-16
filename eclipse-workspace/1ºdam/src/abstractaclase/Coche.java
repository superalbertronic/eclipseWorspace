package abstractaclase;
import abstractavehiculos.abstractaclase.Vehiculo;

public class Coche extends Vehiculo {

	public Coche(String modelo, String color) {
		
		super(modelo,color);
		// TODO Esbozo de constructor generado automÃ¡ticamente
	}
	
	@Override
	public void mostrardatos() {
		System.out.println("su vehiculo es un coche del modelo "+getModelo()+ " y el color es "+getColor());
	}
	
	
}
