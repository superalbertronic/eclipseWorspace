package refactorizarmovermetodos;
public class MainRefactorizado {
	public static void main(String[] args) { 
		TipoEmpleadoRefactorizado supervisor = new TipoEmpleadoRefactorizado("supervisor", 10.0);
		TipoEmpleadoRefactorizado dependiente = new TipoEmpleadoRefactorizado("dependiente", 8.0);
		EmpleadoRefactorizado empleado1 = new EmpleadoRefactorizado(40, 10, supervisor);
		EmpleadoRefactorizado empleado2 = new EmpleadoRefactorizado(30, 5, dependiente);
		empleado1.getSueldo();
	}
}
