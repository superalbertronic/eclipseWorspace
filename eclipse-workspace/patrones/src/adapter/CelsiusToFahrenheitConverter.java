package adapter;

//Paso 2: Implementa la clase CelsiusToFahrenheitConverter que implementa la interfaz TemperatureConverter
class CelsiusToFahrenheitConverter implements TemperatureConverter {
 @Override
 public double convertCelsiusToFahrenheit(double celsius) {
     return (celsius * 9 / 5) + 32;
 }
}