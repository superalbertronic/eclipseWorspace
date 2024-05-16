package adapter2;

//Paso 5: En el método main, utiliza el adaptador para convertir la temperatura de Celsius a Fahrenheit
public class Main {
 public static void main(String[] args) {
     // Crear una temperatura en Celsius
	 double kilometros=10;
     Kilometros kilometrosTemp = new Kilometros(kilometros);

     // Crear un adaptador y pasar la temperatura en Celsius
     DistanciaAdapter adapter = new DistanciaAdapter(kilometrosTemp);

     // Utilizar el adaptador para convertir la temperatura a Fahrenheit
     double millasTemp = adapter.convertKilometrosAMillas(kilometrosTemp.getValue());

     // Imprimir el resultado
     System.out.println("la distancia en kilometros es: "+kilometros);
     System.out.println("La distancia en Millas: " + millasTemp);
 }
}