package patronbuilder;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private String email;
    private String puesto;
    private String empresa;
    private double salario;
    
    // Constructor privado para usar el patrón Builder
   private Persona(String nombre, int edad, String direccion, String email, String puesto, String empresa
		  ,double salario ) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.email = email;
        this.puesto= puesto;
        this.empresa=empresa;
        this.salario=salario;
    }
    
    public String getEmpresa() {
	return empresa;
}

public double getSalario() {
	return salario;
}

	// Métodos getter para acceder a los atributos de la clase
    public String getNombre() {
        return nombre;
    }
    public String getPuesto() {
		return puesto;
	}

	public int getEdad() {
        return edad;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getEmail() {
        return email;
    }
    
    // Clase Builder interna para construir objetos Persona
    public static class PersonaBuilder {
        private String nombre;
        private int edad;
        private String direccion;
        private String email;
        private String puesto;
        private String empresa;
        private double salario;
        
        public PersonaBuilder setEmpresa(String empresa) {
			this.empresa = empresa;
			return this;
		}
		public PersonaBuilder setSalario(double salario) {
			this.salario = salario;
			return this;
		}
		public PersonaBuilder setPuesto(String puesto) {
			this.puesto = puesto;
			return this;
		}
		// Métodos setter para establecer los atributos opcionales
        public PersonaBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        public PersonaBuilder setEdad(int edad) {
            this.edad = edad;
            return this;
        }
        public PersonaBuilder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }
        public PersonaBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        
        // Método build para crear el objeto Persona con los atributos opcionales
        public Persona build() {
            return new Persona(nombre, edad, direccion, email,puesto, empresa,salario);
        }
    }
}
