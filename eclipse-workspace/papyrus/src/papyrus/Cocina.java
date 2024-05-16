package papyrus;


//Clase Director que utiliza el Builder para construir pizzas
class Cocina {
	//variable de instancia de tipo PizzaBuilder
private PizzaBuilder builder;
//seter de la variable de instancia
public void setBuilder(PizzaBuilder builder) {
   this.builder = builder;
}
// con este metodo, lo que hacemos es que nos devuelva una instancia de pizza al invocar el metodo
public Pizza getPizza() {
   return builder.getPizza();
}

//creamos un metodo que construya la pizza utilizando los metodos de la interfaz
public void construirPizza() {
   builder.construirMasa();
   builder.construirSalsa();
   builder.construirRelleno();
}
}