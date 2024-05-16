package relog;

public class RelojMain {

	public static void main(String[] args) {
		
		Reloj reloj1=new Reloj();
		reloj1.mostrarReloj(reloj1);
		
		reloj1.modificarHora(22, 20, 30);
		reloj1.mostrarReloj(reloj1);
		
		
		reloj1.sumarSegundos(120);
		reloj1.mostrarReloj(reloj1);
		
		
		reloj1.sumarSegundo();
		reloj1.mostrarReloj(reloj1);
		
		
		
		
		
		
		
		
		

	}

}
