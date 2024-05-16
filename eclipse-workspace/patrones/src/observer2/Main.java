package observer2;

public class Main {
    public static void main(String[] args) {
        // Crear el sensor de temperatura
    	 SensorTemperatura sensor = new SensorTemperatura();

        // Crear usuarios y agregarlos como observadores
        Usuario cenec = new Usuario(30);
        sensor.agregarObservador(cenec);
        // Simular cambios en la temperatura
       
       
        sensor.setTemperatura(40);
       
    }
}
