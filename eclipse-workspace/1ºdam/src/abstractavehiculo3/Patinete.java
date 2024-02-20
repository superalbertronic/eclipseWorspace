package abstractavehiculo3;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patinete extends Vehiculo {

	 private double bateria;
	
	public Patinete(String modelo, String color, Double bateria) {
		super(modelo, color);
		this.bateria = bateria;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void MostrarDatos() {
		System.out.println("El modelo es " + getModelo() + " y el color es " + getColor() +
				" la bateria es " +bateria);
	}
	@Override
	public void Gracias() {
		super.Gracias();
		System.out.println("Esperamos que su próxima patinete, lo compre con nosostros");
		
	}
	void Fecha() {
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        System.out.println("Fecha actual: " + localDate.format(formatter));
    }

	}
	


