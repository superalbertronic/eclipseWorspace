package abstractaclase;

public abstract class Vehiculo {
	private String modelo;
	private String color;
	//metodo constructor, inicilizamos las variables
	public Vehiculo(String modelo, String color) {
		super();
		this.modelo = modelo;
		this.color = color;
	}
	
	//getter setter modelo y coche
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//clase abstracta
	public void mostrardatos() {
		
	}
	
	

}
