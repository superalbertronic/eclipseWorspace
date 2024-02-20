package instituto;

public class InstitutoMain {
   
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Profesor profe=new Profesor("Alberto","Programación","Ruiz",12345);
		Alumno alu=new Alumno("Juan ","Base de datos","Brenes",6666 );
		
		System.out.println("profesor-----------------------------");
		profe.MostrarDatos();
		profe.Pagar(1300);
		profe.Calendario();
		System.out.println("alumno--------------------------------");
		alu.MostrarDatos();
		alu.Calendario();
		alu.Nota(7);
		
	}

}
