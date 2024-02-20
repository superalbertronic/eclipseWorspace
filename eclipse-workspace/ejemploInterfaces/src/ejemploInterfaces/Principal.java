package ejemploInterfaces;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// usamos nuestro evento para 
		Persona miguel = new Persona("Miguel", "11122233p");
		EventoCambiarPropiedad manejador = new CorregirDni();
		EventoCambiarPropiedad manejador2 = new InformarEstado();
		miguel.addEventoCambiarPropiedad(manejador);
		miguel.addEventoCambiarPropiedad(manejador2);
		miguel.setDni("11133322b");
		miguel.setNombre("Sonia");
		
		// usamos el mismo evento pero para usarlo en la clase coche pero lo añadimos como clase anonima
		Coche seat = new Coche("Seat", "1233445Fgw");
		seat.addEventoCambiarPropiedad(new EventoCambiarPropiedad() {
			@Override
			public void propiedadCambiada(ObjetoEvento e) {
				Coche c = (Coche)e.getOrigen();
				String mensaje = "La información del coche actualizada es:\nmarca: "+c.getMarca()+"\nmatricula: "+c.getMatricula();
				JOptionPane.showMessageDialog(null, mensaje);
			}
		});
		seat.setMarca("Hyundai");
		seat.setMatricula("222333rft");
		
		// usamos el mismo evento pero compatible tanto para persona como para coche
		Persona ana = new Persona("Ana", "11122233p");
		Coche renault = new Coche("Renault", "444333dfg");
		EventoCambiarPropiedad manejador3 = new InformacionModificacion();
		ana.addEventoCambiarPropiedad(manejador3);
		renault.addEventoCambiarPropiedad(manejador3);
		ana.setDni("22211122w");
		renault.setMarca("Dacia");
	}

}
