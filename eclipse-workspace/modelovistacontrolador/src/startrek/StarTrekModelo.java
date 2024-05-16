package startrek;

//Modelo: Clase Videojuego
class StarTrekModelo {
private String nombre;
private String cargo;
private String raza;

public StarTrekModelo(String nombre, String cargo, String raza) {
   this.nombre = nombre;
   this.cargo = cargo;
   this.raza=raza;
}

public String getNombre() {
   return nombre;
}

public String getCargo() {
   return cargo;
}

public String getRaza() {
	   return raza;
	}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}

public void setRaza(String raza) {
	this.raza = raza;
}



}

