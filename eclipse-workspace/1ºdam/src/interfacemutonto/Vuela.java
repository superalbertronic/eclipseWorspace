package interfacemutonto;
//Interfaz para criaturas que pueden volar
interface Vuela {
 void volar();
}
interface come{
	void comer();
}

//Clase para pájaros que pueden volar
class Pajaro implements Vuela {
 @Override
 public void volar() {
     System.out.println("El pájaro está volando.");
 }
  
}


public class InterfaceBasico {
 public static void main(String[] args) {
     Pajaro ave = new Pajaro();
     ave.volar();
 }
}
