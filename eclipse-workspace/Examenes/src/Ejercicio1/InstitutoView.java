package Ejercicio1;
import java.util.List;
import java.sql.Connection;

public class InstitutoView {
    public void mostrarInstitutos(List<Instituto> institutos) {
        for (Instituto instituto : institutos) {
            System.out.println("ID: " + instituto.getId()); 
            System.out.println("Nombre: " + instituto.getNombre()); 
            System.out.println("Primer apellido: " + instituto.getApellido1()); 
            System.out.println("Segundo apellido: " + instituto.getApellido2()); 
            System.out.println("Fecha de nacimiento: " + instituto.getFecha_nacimiento()); 
            System.out.println("Es repetidor: " + instituto.getEs_repetidor()); 
            System.out.println("Telefono: " + instituto.getTelefono());
            System.out.println();
        }
    }
}
