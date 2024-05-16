package builder;




//Implementación concreta del Builder para Pizza Hawaiana
class PizzaBarbacoa implements PizzaBuilder {
private Pizza pizza;

public PizzaBarbacoa() {
   pizza = new Pizza("Fina", "Tomate", "carne buena","Familiar");
}

@Override
public void construirMasa() {
   pizza.masa="super gruesa";
}

@Override
public void construirSalsa() {
   pizza.salsa="barbacoa";
}

@Override
public void construirRelleno() {
   pizza.relleno="carne to wena en verdad";
}
@Override
public void construirSize() {
  pizza.size="extra familiar";
}


@Override
public Pizza getPizza() {
   return pizza;
}
}
