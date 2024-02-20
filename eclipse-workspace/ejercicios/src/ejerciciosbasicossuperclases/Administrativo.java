package ejerciciosbasicossuperclases; 

public class Administrativo extends Nominas {
	
	 public Administrativo(String nombre, String apellido, String DNI) {
			 this.sueldo=1500;
			 this.nombre=nombre;
			 this.apellido=apellido;
			 this.DNI=DNI;
			 this.puesto="ADMINISTRATIVO";
	 }
	
}
