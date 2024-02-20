package patronbuilder;



public class PersonaBuilderMain {

    public static void main(String[] args) {
    	
    	// Crear un objeto Persona con nombre, edad y dirección
    	Persona persona1 = new Persona.PersonaBuilder()
    	    .setNombre("Juan")
    	    .setEdad(30)
    	    .setDireccion("Calle Mayor, 123")
    	    .build();
    	System.out.println(persona1.getNombre()+ " " +persona1.getEdad()+" "+persona1.getDireccion()+ " , "
    	    +persona1.getPuesto());
    	
    	// Crear un objeto Persona con nombre y email
    	Persona persona2 = new Persona.PersonaBuilder()
    	    .setNombre("María")
    	    .setEmail("maria@example.com")
    	    .build();
    	System.out.println(persona2.getNombre()+ " " +persona2.getEdad()+" "+persona2.getDireccion()+" "+
    			persona2.getEmail()+ " , " +persona2.getPuesto());
    	
    	// Crear un objeto Persona con todos los atributos
    	Persona persona3 = new Persona.PersonaBuilder()
    	    .setNombre("Pedro")
    	    .setEdad(25)
    	    .setDireccion("Plaza del Sol, 1")
    	    .setEmail("pedro@example.com")
    	    .setPuesto("Programador")
    	    .setEmpresa("Digitechfp")
    	    .setSalario(1200.00)
    	    .build();
    	System.out.println(persona3.getNombre()+ " " +persona3.getEdad()+" "+persona3.getDireccion()+" "+
    			persona3.getEmail()+" , "+ persona3.getDireccion()+ " , "
        	    +persona3.getPuesto()+ " , " +persona3.getEmpresa()+", "+ persona3.getSalario());    }

}
