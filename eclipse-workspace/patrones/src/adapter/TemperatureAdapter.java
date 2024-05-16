package adapter;

//Paso 4: Implementa el adaptador TemperatureAdapter para adaptar CelsiusTemperature a TemperatureConverter
class TemperatureAdapter implements TemperatureConverter {
 private CelsiusTemperature celsiusTemperature;

 public TemperatureAdapter(CelsiusTemperature celsiusTemperature) {
     this.celsiusTemperature = celsiusTemperature;
 }

 @Override
 public double convertCelsiusToFahrenheit(double celsius) {
     return new CelsiusToFahrenheitConverter().convertCelsiusToFahrenheit(celsiusTemperature.getValue());
 }
}
