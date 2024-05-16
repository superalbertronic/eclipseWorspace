package multiherencia;

//Primera interfaz
interface Nadador {
 void nadar();
}

//Segunda interfaz
interface Volador {
 void volar();
}

interface Comedor{
	void comer();
	
}

//Clase que implementa ambas interfaces
class Pato implements Nadador, Volador, Comedor {
 @Override
 public void nadar() {
     System.out.println("El pato nada en el agua");
 }

 @Override
 public void volar() {
     System.out.println("El pato vuela en el cielo");
 }
 @Override
 public void comer() {
	 System.out.println("El pato come caviar");
	 }
	 
 }
 
//Clase que implementa ambas interfaces
class Alberto implements Nadador, Volador, Comedor {
@Override
public void nadar() {
   System.out.println("Alberto nada en el agua, ave");
}

@Override
public void volar() {
   System.out.println("El Alberto en verdad vuela en el cielo");
}
@Override
public void comer() {
	 System.out.println("El alberto come cosas towena");
	 }
	 
}


public class Main {
 public static void main(String[] args) {
     Pato pato = new Pato();
     pato.nadar(); // Llama al método nadar() de la interfaz Nadador
     pato.volar(); // Llama al método volar() de la interfaz Volador
     pato.comer();
     Alberto albert=new Alberto();
     albert.nadar();
     albert.volar();
     albert.comer();
     
 }
}

