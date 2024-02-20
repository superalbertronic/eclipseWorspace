package abstracta;

public class Becario extends Sueldos{
	private String inicio;
	private String fin;
	

	public Becario(String nombre, String puesto, double salario, String mes, String inicio, String fin) {
		super(nombre, puesto, salario,mes);
		// TODO Esbozo de constructor generado automáticamente
		this.inicio=inicio;
		this.fin=fin;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
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
