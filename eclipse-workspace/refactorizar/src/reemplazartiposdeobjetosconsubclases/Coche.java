package reemplazartiposdeobjetosconsubclases;

//clase Coche extiende de vehiculo
class Coche extends Vehiculo {
  public Coche(int velocidad) {
      super(velocidad);
  }
//sobreescribimos el metodo acelerar
  @Override
  public void acelerar() {
      velocidad += 10;
      System.out.println("El coche ha sido acelerado. Velocidad actual: " + velocidad);
  }
@Override
public void frenar() {
	velocidad-=5;
	System.out.println("El coche ha sido frenado. Velocidad actual: " + velocidad);
	
}
  
  
}