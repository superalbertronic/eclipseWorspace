package patrondiseñoobserver;

public class MainObserver {
	// Ejemplo de uso del patrón Observer.

	    public static void main(String[] args) {
	        WeatherData weatherData = new WeatherData();
	        Display display = new Display();

	        weatherData.registrarObservador(display);

	        weatherData.actualizarTemperatura(25.5f);
	        weatherData.actualizarTemperatura(26.0f);
	    }
	}


