package patronbuilder;

public class Persona {
        public Persona setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        public Persona setEdad(int edad) {
            this.edad = edad;
            return this;
        }
        public Persona setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }
        public Persona setEmail(String email) {
            this.email = email;
            return this;
        }
        
        // MÃ©todo build para crear el objeto Persona con los atributos opcionales
		public Persona setPuesto(String puesto) {
			this.puesto = puesto;
			return this;
		}
		// MÃ©todos setter para establecer los atributos opcionales
        
        public Persona setEmpresa(String empresa) {
			this.empresa = empresa;
			return this;
		}
    private String nombre;
    private int edad;
    private String direccion;
    private String email;
    private String puesto;
    private String empresa;
// MÃ©todos getter para acceder a los atributos de la clase
public static double salario;
    
    // Constructor privado para usar el patrÃ³n Builder
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
        public Persona build() {
            return new Persona(nombre, edad, direccion, email,puesto, empresa,salario);
        }
		public PersonaBuilder setNombre(String string) {
			// TODO Auto-generated method stub
			return this;
		}
		public PersonaBuilder setEdad(int i) {
			// TODO Auto-generated method stub
			return this;
		}
		public PersonaBuilder setDireccion(String string) {
			// TODO Auto-generated method stub
			return this;
		}
		public PersonaBuilder setEmail(String string) {
			// TODO Auto-generated method stub
			return this;
		}
		public PersonaBuilder setPuesto(String string) {
			// TODO Auto-generated method stub
			return this;
		}
		public PersonaBuilder setEmpresa(String string) {
			// TODO Auto-generated method stub
			return this;
		}
    }

	public Persona getSalario() {
		// TODO Auto-generated method stub
		return this;
	}
	public Persona build() {
		// TODO Auto-generated method stub
		return this;
	}
	public Persona setSalario(double d) {
		// TODO Auto-generated method stub
		return this;
	}
}
