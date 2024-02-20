package salario;

public class Salario {
	private String nombre;
	private double salario;
	private double incremento;
	
	
//metodo constructor, en el que los argumentos son nombre, salario, incremento	
	public Salario(String nombre, double salario, double incremento) {
		this.incremento = incremento;
		this.nombre=nombre;
		this.salario=salario;
	}
	//sobrecarga del constructor
	public Salario(String nombre, double salario) {
		this.incremento = incremento;
		this.nombre=nombre;
		this.salario=salario;
	}
	
	
	//metodo get y set de incremento
	public double getIncremento() {
		return incremento;
	}


	public void setIncremento(double incremento) {
		this.incremento = incremento;
	}

	//metodo get y set de nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodo get y set de salario
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
