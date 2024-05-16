package ejerciciobasico;

import javax.sound.sampled.Control;

public class Main {
	 public static void main(String[] args) {
		 
		Modelo modelo=new Modelo("Alberto",39,"Calle Larios");
		Vista vista=new Vista()	;
		Controlador controlador=new Controlador(modelo,vista);
	    controlador.actualizarVista();
	    
	    /*modificar los datos del objeto creado, utilizando los metodos creados
		en el controlador, podriamos usar direcdtamente los metodos creados en modelo,
		pero no es seguro, n*/
	    System.out.println("en verdad "+controlador.getDomicilioModelo());
	    
	    controlador.setNombreModelo("Eva");
	    controlador.setEdadModelo(39);
	    controlador.setDomicilioModelo("calle martin");
	    System.out.println("en verdad "+controlador.getDomicilioModelo());
	    controlador.actualizarVista();
	    // crear otro objeto
	  
	    Modelo modelo2=new Modelo("Cristina",30,"calle luna");
	    Controlador controlador2=new Controlador(modelo2,vista);
	    controlador2.actualizarVista();
	    //modificando los dtos usando los metodos del controlador
	    controlador2.setDomicilioModelo("Avenida de Europa");
	    controlador2.setEdadModelo(50);
	    controlador2.setNombreModelo("Paco");
	    
	    
	 }
}