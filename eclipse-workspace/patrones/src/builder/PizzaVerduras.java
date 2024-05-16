package builder;




//Implementación concreta del Builder para Pizza Hawaiana
class PizzaVerduras implements PizzaBuilder {
private Pizza pizza;

public PizzaVerduras() {
   pizza = new Pizza("Fina", "Tomate", "carne buena","Familiar");
}

@Override
public void construirMasa() {
   pizza.masa="muy fina";
}

@Override
public void construirSalsa() {
   pizza.salsa="boloñesa";
}

@Override
public void construirRelleno() {
   pizza.relleno="verduras de todo tipo";
}
@Override
public void construirSize() {
  pizza.size="familiar";
}


@Override
public Pizza getPizza() {
   return pizza;
}
}
