package abstracta;

public class Empleados extends Sueldos{

	public Empleados(String nombre, String puesto, double salario, String mes) {
		super(nombre, puesto, salario,mes);
		// TODO Esbozo de constructor generado automáticamente
	}

    @Override
  
    public double calcularSalario() {
        return (getSalario() * 0.10+getSalario()); 
    }
    @Override
    public double Irpf() {
    	double salariototal=(getSalario() * 0.10+getSalario());
        return salariototal*0.15 ; 
    } 
    
    public void vacaciones() {
    	System.out.println("Sus vacaciones son en Agosto");
    	
    	
    }
    
    
	
}
