package diagramasdeclase2;

//Clase Empleado que hereda de Persona
public class Cliente extends Persona {
 // Relación de asociación con Directivo
private String email;
	
 // Constructor
 public Cliente(String nombre, String email) {
	 super(nombre);
     this.email=email;
     
 }

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

 
}
