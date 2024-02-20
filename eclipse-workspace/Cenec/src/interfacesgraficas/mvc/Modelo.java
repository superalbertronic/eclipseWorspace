package mvc;

public class Modelo {
	private double calculadora;
	private String operacion, punto;
	private boolean EstadoInicial, nuevoNumero;

	public Modelo() {
		reset();
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

	public String getPunto() {
		return punto;
	}

	public void setPunto(String punto) {
		this.punto = punto;
	}

	public boolean isEmptyOperacion() {
		return operacion.isEmpty();
	}

	public boolean isEmptyPunto() {
		return punto.isEmpty();
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

		switch (operacion) {
			case "+":calculadora += number;break;
			case "-":calculadora = isEstadoInicial() ? number : calculadora-number;break;
			case "*":calculadora = isEstadoInicial() ? number : calculadora*number;break;
			case "/":calculadora = isEstadoInicial() ? number : calculadora/number;break;
		}

		return formatearResultado(isEmptyOperacion() ? number : calculadora);
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
		this.punto = "";
		this.EstadoInicial = false;
		this.nuevoNumero = true;
	}
	
	public String establecerResultado(String n){
		String resultado = calcularOperación(n);
		reset();
		this.nuevoNumero = true;
		return resultado;
	}
	
	public String establecerPunto(String p, String n){
		String resultado = checkPoint() ? n+p : n;
		this.punto = checkPoint()? p : this.punto;
		return resultado;
	}
	
	public String establecerNumero(String n,String pantalla){
		String resultado = getNumber(n, pantalla);
		this.nuevoNumero = false;
		return resultado;
	}
	
	private String getNumber(String n, String pantalla){
		return isNuevoNumero() || isZero(pantalla) ? n : pantalla+n;
	}
	
	private boolean isZero(String pantalla) {
		return isEmptyPunto() ? Double.parseDouble(pantalla) == 0 : false;
	}
	
	private boolean checkPoint (){
		return isEmptyPunto() && !isNuevoNumero();
	}
	
	public String establecerReset(){
		reset();
		return "0";
	}

	public void reset() {
		this.calculadora = 0;
		this.operacion = "";
		this.punto = "";
		this.EstadoInicial = true;
		this.nuevoNumero = false;
	}
}