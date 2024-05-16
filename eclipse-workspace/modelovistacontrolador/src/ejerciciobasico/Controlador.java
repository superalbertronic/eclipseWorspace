package ejerciciobasico;

public class Controlador {
	//variables de instancias tipo Modelo y Vista
	private Modelo modelo;
	private Vista vista;
	//constructor
	public Controlador(Modelo modelo, Vista vista) {
		
		this.modelo = modelo;
		this.vista = vista;
	}
	//actualiza los getter y setter del modelo
	public void setNombreModelo(String nombre) {
		modelo.setNombre(nombre);
	}
	public void setEdadModelo(int edad) {
		modelo.setEdad(edad);
		
	}
	public void setDomicilioModelo(String domicilio) {
		modelo.setDomicilio(domicilio);;
		
	}
	
	
	public String getDomicilioModelo() {
		return modelo.getDomicilio();
	}
	
	//actualiza el metodo mostrarDatos de vista
	public void actualizarVista() {
		vista.mostrarDatos(modelo.getNombre(), modelo.getEdad(),modelo.getDomicilio());
	}
	
	
}
