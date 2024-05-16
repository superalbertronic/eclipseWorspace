package builderpizza;


//Implementación concreta del Builder para Pizza Hawaiana
class PizzaBarbacoaBuilder implements PizzaBuilder {
private Pizza pizza;
// definimos como será la pizza por defecto
public void PizzaBarbacoaBuilder() {
   pizza = new Pizza("normal", "Tomate", "Carne");
}
//sobreescribimos la masa
@Override
public void construirMasa() {
   pizza.masa="gruesa";
}
//dejamos la salsa como esta definida en el constructor
@Override
public void construirSalsa() {
	pizza.salsa="Tomate picante";
 
}
//dejamos el relleno como hemos definido enn el constructor
@Override
public void construirRelleno() {
	pizza.relleno="carne de Vaca";
}
//sobreescrimos el metodo getPizza, sin
@Override
public Pizza getPizza() {
  return pizza;
}
}