package patrondiseñoobserver;

import java.util.ArrayList;
import java.util.List;

// Interfaz para implementar los observadores.
interface Observer {
    void actualizar(float temperatura);
}

// Interfaz para implementar el sujeto que notificará a los observadores.
interface Subject {
    void registrarObservador(Observer observador);
    void eliminarObservador(Observer observador);
    void notificarObservadores();
}

// Clase que recopila los datos del clima y notifica a los observadores.
class WeatherData implements Subject {
    private List<Observer> observadores = new ArrayList<>();
    private float temperatura;

    void actualizarTemperatura(float nuevaTemperatura) {
        this.temperatura = nuevaTemperatura;
        notificarObservadores();
    }

    @Override
    public void registrarObservador(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.actualizar(temperatura);
        }
    }
}

// Clase que muestra la temperatura actual.
class Display implements Observer {
    private float temperatura;

    @Override
    public void actualizar(float temperatura) {
        this.temperatura = temperatura;
        mostrarTemperatura();
    }

    void mostrarTemperatura() {
        System.out.println("La temperatura actual es: " + temperatura + " grados.");
    }
}

