package abstractavehiculos;

public class Coche extends Vehiculo {
	int cilindrada;

	  @Override
	  void acelerar() {
	    System.out.println(" Acelerando Coche ");
	  }

	  @Override
	  void frenar() {
	    System.out.println(" Frenando Coche ");
	  }
	}


