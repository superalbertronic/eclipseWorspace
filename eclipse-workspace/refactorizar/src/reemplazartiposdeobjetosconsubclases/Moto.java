package reemplazartiposdeobjetosconsubclases;

//clase Coche extiende de vehiculo
class Moto extends Vehiculo {
  public Moto(int velocidad) {
      super(velocidad);
  }
//sobreescribimos el metodo acelerar
  @Override
  public void acelerar() {
      velocidad += 10;
      System.out.println("La moto ha sido acelerado. Velocidad actual: " + velocidad);
  }
@Override
public void frenar() {
	velocidad-=5;
	System.out.println("La moto ha sido frenado. Velocidad actual: " + velocidad);
	
}
  
  
}