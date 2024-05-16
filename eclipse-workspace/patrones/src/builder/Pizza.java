package builder;

//Clase Pizza que queremos construir
class Pizza {
	//atributos de la pizza
String masa;
String salsa;
String relleno;
String size;
	//constructor
public Pizza(String masa, String salsa, String relleno, String size) {
   this.masa = masa;
   this.salsa = salsa;
   this.relleno = relleno;
}

//metodo para mostrar los datos de la pizza
public void mostrar() {
   System.out.println("Pizza: Masa-" + masa + ", Salsa-" + salsa + ", Relleno-" + relleno
		   +" ,Size:"+size);
}
}


