package builder;




//Implementación concreta del Builder para Pizza Hawaiana
class PizzaHawaianaBuilder implements PizzaBuilder {
private Pizza pizza;

public PizzaHawaianaBuilder() {
   pizza = new Pizza("Fina", "Tomate", "Piña y Jamón","Familiar");
}

@Override
public void construirMasa() {
   pizza.masa="gruesa";
}

@Override
public void construirSalsa() {
   pizza.salsa="Tomate con oregano";
}

@Override
public void construirRelleno() {
   pizza.relleno="Piña, jamon y queso";
}
@Override
public void construirSize() {
  pizza.size="pequeña";
}


@Override
public Pizza getPizza() {
   return pizza;
}
}
