package hilos;

public class Hilo1 extends Thread {

	 /*   public PrioridadesHilos(String nombre) {
	        super(nombre);
	    }*/

	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Hilo " + getName() + " - vueltas: " + i);
	        }
	    }

	    public static void main(String[] args) {
	        Hilo1 hilo1 = new Hilo1();
	        Hilo1 hilo2 = new Hilo1();
	        
	        hilo1.setName("Prioridad Alta");
	        hilo2.setName("Prioridad Baja");

	        // Establecemos las prioridades
	        hilo1.setPriority(10); // Prioridad máxima
	        hilo2.setPriority(1); // Prioridad mínima

	        // Iniciamos los hilos
	        hilo1.start();
	        hilo2.start();
	        
	      
	    }
	}