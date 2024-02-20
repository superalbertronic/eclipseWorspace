package abstractavehiculos;

class Bicicleta extends Vehiculo {
	  String tipo;

	  @Override
	  void acelerar() {
	    System.out.println(" Acelerando Bicicleta ");
	  }

	  @Override
	  void frenar() {
	    System.out.println(" Frenando Bicicleta ");
	  }
	}
