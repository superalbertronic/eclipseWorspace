package papyrus;


//Implementación concreta del Builder para Pizza Hawaiana
class PizzaHawaianaBuilder implements PizzaBuilder {
private Pizza pizza;
// definimos como será la pizza por defecto
public PizzaHawaianaBuilder() {
   pizza = new Pizza("Fina", "Tomate", "Piña y Jamón");
}
//sobreescribimos la masa
@Override
public void construirMasa() {
   pizza.masa="normal";
}
//dejamos la salsa como esta definida en el constructor
@Override
public void construirSalsa() {
 
}
//dejamos el relleno como hemos definido enn el constructor
@Override
public void construirRelleno() {
   // No se modifica el relleno para la pizza hawaiana
}
//sobreescrimos el metodo getPizza, sin
@Override
public Pizza getPizza() {
  return pizza;
}
}