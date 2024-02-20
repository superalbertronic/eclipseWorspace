package puertaslogicas;

public class PuertasLogicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean A,B,total;
		//PUERTAS BASICAS
		//puerta logica AND
		A=true;
		B=false;
		total=A&&B;
		if (total==true) {
		System.out.println("AND Encendido");
		}else {
			System.out.println("AND apagado");
		}
		
		//puerta logica OR
		total=A||B;
		if (total==true) {
		System.out.println("OR Encendido");
		}else {
			System.out.println ("OR apagado");
		}
		//puerta logica NOT
				
				if (total!=true) {
				System.out.println("NOT Encendido");
				}else {
					System.out.println ("NOT apagado");
				}
	  //PUERTAS UNIVERSALES
	  // PUERTAS NAND
		total=!A||!B;
		if (total==true) {
		System.out.println("NAND Encendido");
		}else {
			System.out.println("NAND apagado");
		}	
		// PUERTAS NOR
				total=A||B;
				if (total!=true) {
				System.out.println("NOR Encendido");
				}else {
					System.out.println("NOR apagado");
				}	
		
		
	}

}
