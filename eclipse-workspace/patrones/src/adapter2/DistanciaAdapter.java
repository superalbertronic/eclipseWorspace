package adapter2;

//Paso 4: Implementa el adaptador TemperatureAdapter para adaptar CelsiusTemperature a TemperatureConverter
class DistanciaAdapter implements DistanciaConverter {
 private Kilometros kilometros;

 public DistanciaAdapter(Kilometros kilometros) {
     this.kilometros = kilometros;
 }

 @Override
 public double convertKilometrosAMillas(double kilometrosValue) {
     return new KmAMillasConverter().convertKilometrosAMillas(kilometros.getValue());
 }
}
