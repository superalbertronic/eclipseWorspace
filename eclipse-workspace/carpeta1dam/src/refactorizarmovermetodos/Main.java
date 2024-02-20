package refactorizarmovermetodos;



	public class Main {
		public static void main(String[] args) {
			TipoEmpleado supervisor = new TipoEmpleado("Supervisor", 10.0);
			Empleado empleado1 = new Empleado();
			empleado1.setTipo(supervisor);
			empleado1.setHoras(40);
			empleado1.setHorasextra(10);
			System.out.println("El sueldo del empleado 1 es: " + empleado1.getSueldo());
			
			TipoEmpleado dependiente = new TipoEmpleado("Dependiente", 8.0);
			Empleado empleado2 = new Empleado();
			empleado2.setTipo(dependiente);
			empleado2.setHoras(30);
			empleado2.setHorasextra(5);
			System.out.println("El sueldo del empleado 2 es: " + empleado2.getSueldo());
		}
	}


