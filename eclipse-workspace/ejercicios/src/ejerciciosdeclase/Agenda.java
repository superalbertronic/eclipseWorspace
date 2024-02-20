package ejerciciosdeclase;

public class Agenda {
 private Contacte[]contactos;
 private int tamaño;
 public Agenda() {
	 contactos=new Contacte[100];
	 tamaño=0;
	 
 }
 public void crearContacto (String nombre, String telefono) {
	Contacte co = new Contacte (nombre, telefono);
	if (tamaño<100) {
		contactos[tamaño]=co;
		tamaño++;
		
	}else {
		System.out.println("ERROR NO HAY SITIO EN TU AGENDA");
	}

 }
 public void crerContacto(Contacte C) {
	 if (tamaño<100) {
		contactos[tamaño]=C;
			tamaño++;
			
		}else {
			System.out.println("ERROR NO HAY SITIO EN TU AGENDA");
		}
 }
 public void listaDatosContacto() {
	 for(int i=0;i<tamaño;i++) {
		 System.out.println(contactos[i]);
		 
	 }
 	
 }
 
}
