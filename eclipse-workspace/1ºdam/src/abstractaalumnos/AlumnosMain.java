package abstractaalumnos;


public class AlumnosMain {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
        String[][] alumnos = {{"Alberto",  "Base de Datos", "8"}, {"Alberto",  "Programaci�nn", "10"}, 
                             {"Alberto",  "Entorno", "9"}, {"Alberto",  "Sistemas", "4"}, 
                             {"Alberto",  "Lenguaje de Marcas", "10"}, {"Juan",  "Base de Datos", "4"}, 
                             {"Juan",  "Programaci�n", "4"}, {"Juan", "Entorno", "8"}, 
                             {"Juan",  "Sistemas", "10"}, {"Juan",  "Lenguaje de Marcas", "7"}};
        
        for (int i = 0; i < alumnos.length; i++) {
            Alumnos alumno = new Alumnos(alumnos[i][0],  alumnos[i][1], null, Integer.parseInt(alumnos[i][2]));
            alumno.resultado();
            alumno.mostrar();
        }
        
       
	
	}

}
