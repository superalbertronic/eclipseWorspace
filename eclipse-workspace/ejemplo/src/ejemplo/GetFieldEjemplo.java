package ejemplo;

class Empleado {
	private String nombre;
	public String apellido;
		public Empleado(String apellido) {
			this.apellido=apellido;
		}
		public String getApellido() {
			 return apellido;	
			
		}
		Empleado empl= new Empleado("Ruiz");
		Field emplFields=empl.getField("apellido");
		
}
