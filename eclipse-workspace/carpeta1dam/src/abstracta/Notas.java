package abstracta;

public abstract class Notas {
	protected String nombre;
	protected String asignaturas;
	protected int notas;
	public Notas(String nombre, String asignaturas, int notas) {
		super();
		this.nombre = nombre;
		this.asignaturas = asignaturas;
		this.notas = notas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAsignaturas() {
		return asignaturas;
	}
	public void setAsignaturas(String asignaturas) {
		this.asignaturas = asignaturas;
	}
	public int getNotas() {
		return notas;
	}
	public void setNotas(int notas) {
		this.notas = notas;
	}
		
abstract String resultado();

abstract void mostrar() ;


}



