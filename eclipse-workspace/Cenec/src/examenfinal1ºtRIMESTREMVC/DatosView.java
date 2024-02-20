package examenfinal1ºtRIMESTREMVC;

import java.util.List;

public class DatosView {
	public void mostrarDatos(List<Datos> datos) {
		for (Datos dato: datos) {
			System.out.println("ID: "+ dato.getId());
        	System.out.println("Nombre: "+ dato.getNombre());
        	System.out.println("Apellido1: "+ dato.getApellido1());
        	System.out.println("Apellido2: "+ dato.getApellido2());
        	System.out.println("Fecha de nacimiento: "+ dato.getFecha_nacimiento());
        	System.out.println("Es repetido: "+ dato.isEs_repetido());
        	System.out.println("telefono: "+ dato.getTelefono());
		}
	}
}
