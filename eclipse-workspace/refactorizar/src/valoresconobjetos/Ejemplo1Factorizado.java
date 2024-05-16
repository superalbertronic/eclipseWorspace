package valoresconobjetos;

public class Ejemplo1Factorizado {
  
	private DetallePersonaFactorizado detalles;

  public Ejemplo1Factorizado(DetallePersonaFactorizado detalles) {
        this.detalles = detalles;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + detalles.getNombre());
        System.out.println("Edad: " + detalles.getEdad());
        System.out.println("Género: " + detalles.getGenero());
        System.out.println("Salario: " + detalles.getSalario());
        System.out.println("Profesion: " + detalles.getProfesion());
        System.out.println("Telefono: " + detalles.getTelefono());
        
    }
    

    public static void main(String[] args) {
       
    	DetallePersonaFactorizado detalles = new DetallePersonaFactorizado("Juan", 
        		25, "Masculino",2000.00,"Informatico","952345676");
        
        
        Ejemplo1Factorizado persona = new Ejemplo1Factorizado(detalles);
        persona.mostrarDetalles();
    }
}


