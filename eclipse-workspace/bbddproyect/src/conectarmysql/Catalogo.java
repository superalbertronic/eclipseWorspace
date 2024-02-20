package conectarmysql;

import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {

	
	public void VerCatalogo() {
		
		ArrayList<Coche> coches=new ArrayList<>();
		coches.add(new Coche("Honda civic Type R", 20000, 200, "Deportivo", 5, "No tiene", "Si tiene sistema de ayuda"));
		coches.add(new Coche("SEAT Ateca", 15000, 120, "Sub", 5, "Tiene", "No tiene sistema de ayuda"));
		coches.add(new Coche("Ford Bronco Raptor", 35000, 250, "OFFRoad", 3, "Tiene", "Si tiene sistema de ayuda"));
		ArrayList<Moto> motos = new ArrayList<>();
		motos.add(new Moto ("Harly", 10000, 140, "De pista", "Incluido", 2, "No" ));
		motos.add(new Moto ("Leviant", 6000, 90, "OFFRoad", "Incluido", 2, "No" ));
		motos.add(new Moto ("Kaguasaky", 15000, 200, "De pista", "No Incluido", 2, "No" ));
		motos.add(new Moto ("Mecan", 5000, 70, "Scooter", "Incluido", 3, "Si,asiento copiloto cajetin" ));
			
		Scanner seleccion = new Scanner(System.in);
		int pagina;
		System.out.println("Este es nuestro catalogo:");
		System.out.println("Porfavor seleccione si quiere ver el catalogo de Coches o Motos");
		System.out.println("Pagina:1 Coches|| Pagina:2 Motos|| Pagina:3Salir");
		do{pagina = seleccion.nextInt();
		if(pagina==1) {
		System.out.println("Coches");
		for(int i = 0;i<coches.size(); i++) {
			System.out.println((i+1)+":"+coches.get(i));
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		}else if(pagina==2){
		System.out.println("Motos");
		for(int i = 0;i<motos.size(); i++) {
			System.out.println((i+1)+":"+motos.get(i));
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
			}
		}else {
			System.out.println("|Gracias por su visita a MotoresSL|");
		}
		}while(pagina<3);
		seleccion.close();
	}

		
	}

