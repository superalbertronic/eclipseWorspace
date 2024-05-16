package builder;





//Ejemplo de uso
public class MainBuilder {
 public static void main(String[] args) {
     Cocina cocina = new Cocina();
     PizzaBuilder builder = new PizzaHawaianaBuilder();
 
     PizzaBuilder builder2=new PizzaBarbacoa();
     
     PizzaBuilder builder3=new PizzaVerduras();
     
     //pizza hawaiana
     cocina.setBuilder(builder);
     cocina.construirPizza();
     Pizza pizza = cocina.getPizza();
     pizza.mostrar();
     //pizza barbacoa
     cocina.setBuilder(builder2);
     cocina.construirPizza();
     Pizza pizza2 = cocina.getPizza();
     pizza2.mostrar();
     //pizza verduras
     cocina.setBuilder(builder3);
     cocina.construirPizza();
     Pizza pizza3 = cocina.getPizza();
     pizza3.mostrar();
     
     
     
 }
}
