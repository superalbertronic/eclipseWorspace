package ejerciciosbasicossuperclases; 

public class nominaprincipal {

	public static void main(String[] args) {
		Directivo D = new Directivo("Ana","Garcia","44588554R");
		//String nombre, String apellido, String DNI
		Operario O = new Operario("Manuel","Perez","44589324T");
		Administrativo A = new Administrativo("Ayame","Rodriguez","09658554R");
		System.out.println(D);
		System.out.println(O);
		System.out.println(A);
		
		
		
		
		

	}

}
