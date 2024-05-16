package builder;

//Clase Director que utiliza el Builder para construir pizzas
class Cocina {
private PizzaBuilder builder;

public void setBuilder(PizzaBuilder builder) {
   this.builder = builder;
}


public Pizza getPizza() {
   return builder.getPizza();
}

public void construirPizza() {
   builder.construirMasa();
   builder.construirSalsa();
   builder.construirRelleno();
   builder.construirSize();
}
}