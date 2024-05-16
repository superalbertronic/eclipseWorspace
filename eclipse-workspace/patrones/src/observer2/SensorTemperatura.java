package observer2;

import java.util.ArrayList;
import java.util.List;

class SensorTemperatura {
    private List<Observer> observadores = new ArrayList<>();
    private double temperaturaActual;

    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void setTemperatura(double temperatura) {
        this.temperaturaActual = temperatura;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.actualizar(temperaturaActual);
        }
    }
}
