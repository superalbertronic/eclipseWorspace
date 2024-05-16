package adapter2;

//Paso 2: Implementa la clase KmAMillasConverter que implementa la interfaz DistanciaConverter
class KmAMillasConverter implements DistanciaConverter {
 @Override
 public double convertKilometrosAMillas(double kilometros) {
     return (kilometros * 0.621371);
 }
}