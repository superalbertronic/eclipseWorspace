package ejemploInterfaces;

public class Persona {
	private String nombre;
	private String dni;
	private EventoCambiarPropiedad [] eventos= new EventoCambiarPropiedad[5];
	
	public Persona(String nombre,String dni){
		this.nombre = nombre;
		this.dni = dni;
	}
	
	// Metodos getters
	public String getNombre(){
		return nombre;
	}
	
	public String getDni(){
		return dni;
	}
	
	// Metodos setters
	public void setNombre(String nombre){
		String anterior = this.nombre;
		this.nombre = nombre;
		lanzarEvento("nombre", nombre,anterior);
	}
	
	public void setDni(String dni){
		String anterior = this.dni;
		this.dni = dni;
		lanzarEvento("dni",dni,anterior);
	}
	
	// añadir evento
	public boolean addEventoCambiarPropiedad(EventoCambiarPropiedad manejador){
		for(int i = 0; i<eventos.length; i++){
			if(eventos[i]==null){
				eventos[i]=manejador;
				return true;
			}
		}
		return false;
	}
	
	// lanzar el evento junto con la información del evento
	private void lanzarEvento(String propiedad,String valor,String anterior){
		for(int i = 0;i<eventos.length;i++){
			if(eventos[i]!=null){
				eventos[i].propiedadCambiada(new ObjetoEvento(this, propiedad, valor,anterior));
			}
		}
	}
}
