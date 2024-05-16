package cochesherencia;

public class Vehiculo {
	protected String marca;
	protected String modelo;
	protected String motor;
	protected String color;
	protected double precio;
	
	public Vehiculo() {
		
	}
	public Vehiculo(String marca, String modelo, String motor, double precio, String color) {
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", color=" + color + ", precio="
				+ precio + "]";
	}

}
