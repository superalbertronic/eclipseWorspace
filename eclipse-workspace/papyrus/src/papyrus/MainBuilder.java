package papyrus;




//Ejemplo de uso
public class MainBuilder {
  public static void main(String[] args) {
      
	  // pizza HAWAIANA
	  // 1º Creamos una instancia de Cocina, algo así como tener disponible una cocina para cocinar
      Cocina cocina = new Cocina();
      
      // 2º Creamos una instancia de PizzaBuilder, en este caso, PizzaHawaianaBuilder
      PizzaBuilder builder = new PizzaHawaianaBuilder();
      /* 3º el builder actuaría como una especie de recetaria
      */
      // Establecemos el builder o digamos receta que la Cocina utilizará para construir la pizza
      cocina.setBuilder(builder);

      // 4º La Cocina construye la pizza utilizando el builder establecido
      cocina.construirPizza();

      // 5º Obtenemos la pizza que la Cocina ha construido
      Pizza pizza = cocina.getPizza();

      // 6º Mostramos la pizza
      pizza.mostrar();
      
      //PIZZA BARBACOA
      PizzaBuilder builder2=new PizzaBarbacoaBuilder();
      cocina.setBuilder(builder2);
      cocina.construirPizza();
      Pizza pizza2=cocina.getPizza();
      pizza2.mostrar();
      
      
      
      
  }
}
