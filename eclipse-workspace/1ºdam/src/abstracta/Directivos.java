package abstracta;

public class Directivos extends Sueldos{
    private double dividendos;
	

	
	public Directivos(String nombre, String puesto, double salario, String mes, double dividendos) {
		super(nombre, puesto, salario,mes);
		this.dividendos=dividendos;
		// TODO Esbozo de constructor generado automáticamente
	}
	
	
	
	public double getDividendos() {
		return dividendos;
	}

	public void setDividendos(double dividendos) {
		this.dividendos = dividendos;
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
    @Override
    public double MostrarDividendo() {
    	
    return getSalario()+getDividendos();
    }
    
}