package alumnos;

public class Pistola {
	private String Modelo;
	private int CargadorBala;
	private int PosicionBala;
	
	public Pistola(String Modelo, int CargadorBala, int PosicionBala) {
		
		this.Modelo = Modelo;
		this.CargadorBala = CargadorBala;
		this.PosicionBala = PosicionBala;
		
		
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getCargadorBala() {
		return CargadorBala;
	}

	public void setCargadorBala(int cargadorBala) {
		CargadorBala = cargadorBala;
	}

	public int getPosicionBala() {
		return PosicionBala;
	}

	public void setPosicionBala(int posicionBala) {
		PosicionBala = posicionBala;
	}













}