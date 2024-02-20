package mvc;

public class Modelo {
	private double calculadora;
	private String operacion;
	private boolean EstadoInicial, nuevoNumero, punto;

	public Modelo() {
		reset(false);
	}

	public double getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(double calculadora) {
		this.calculadora = calculadora;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public boolean isPunto() {
		return punto;
	}

	public void setPunto(boolean punto) {
		this.punto = punto;
	}

	public boolean isEmptyOperacion() {
		return operacion.isEmpty();
	}
	
	public boolean isEstadoInicial() {
		return EstadoInicial;
	}
	
	public boolean isNuevoNumero() {
		return nuevoNumero;
	}

	public void setEstadoInicial(boolean estadoInicial) {
		EstadoInicial = estadoInicial;
	}
	
	public void setNuevoNumero(boolean nuevoNumero) {
		this.nuevoNumero = nuevoNumero;
	}

	public String calcularOperación(String n) {
		double number = Double.parseDouble(n);
		
		if(isEstadoInicial() || isEmptyOperacion()){
			calculadora = number;
			return n;
		}
		
		switch (operacion) {
			case "+":calculadora += number;break;
			case "-":calculadora -= number;break;
			case "*":calculadora *= number;break;
			case "/":calculadora /= number;break;
		}

		return formatearResultado(calculadora);
	}

	private String formatearResultado(double n) {
		return isDecimal(n) ? String.format("%.2f", n).replace(',', '.')
				: String.format("%d", (int) n);
	}

	private boolean isDecimal(Double n) {
		return n % 1 != 0;
	}
	
	public String establecerOperacion(String op, String valor){
		this.operacion = op;
		String resultado = calcularOperación(valor);
		resetearNumero();
		return resultado;
	}
	
	public void resetearNumero(){
		this.punto = false;
		this.EstadoInicial = false;
		this.nuevoNumero = true;
	}
	
	public String establecerResultado(String n){
		String resultado = calcularOperación(n);
		reset(true);
		return resultado;
	}
	
	public String establecerPunto(String n){
		
		if(checkPoint()){
			this.punto = true;
			return n+".";
		}
		
		return n;
	}
	
	public String establecerNumero(String n,String pantalla){
		String resultado = isNuevoNumero() || isZero(pantalla) ? n : pantalla+n;
		this.nuevoNumero = false;
		return resultado;
	}
	
	private boolean isZero(String pantalla) {
		return !isPunto() ? Double.parseDouble(pantalla) == 0 : false;
	}
	
	private boolean checkPoint (){
		return !isPunto() && !isNuevoNumero();
	}
	
	public String establecerReset(){
		reset(false);
		return "0";
	}

	public void reset(boolean stateNuevo) {
		this.calculadora = 0;
		this.operacion = "";
		this.punto = false;
		this.EstadoInicial = true;
		this.nuevoNumero = stateNuevo;
	}
}