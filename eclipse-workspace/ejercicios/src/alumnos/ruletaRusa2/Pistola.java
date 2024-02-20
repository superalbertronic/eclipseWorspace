package alumnos.ruletaRusa2;

public class Pistola {
	private String Modelo;
	private int numHuecos;
	private int siguientePosicion = 0;
	private int posicionBala;
	public Pistola(String Modelo, int numHuecos) {
		this.Modelo = Modelo;
		this.numHuecos = numHuecos;
	}
	public void recargar() {
		this.siguientePosicion= 0;
		this.posicionBala = (int) (Math.random()*this.numHuecos);
	}
	
	public boolean disparar() {
		if(this.posicionBala==this.siguientePosicion) {
			this.siguientePosicion++;
			return true;
		}else {
			this.siguientePosicion++;
			return false;
		}
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getNumHuecos() {
		return numHuecos;
	}

	public void setNumHuecos(int numHuecos) {
		this.numHuecos = numHuecos;
	}


	

}