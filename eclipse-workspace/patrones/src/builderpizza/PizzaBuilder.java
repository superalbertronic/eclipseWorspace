package builderpizza;

//Interfaz Builder para construir pizzas
interface PizzaBuilder {
void construirMasa();
void construirSalsa();
void construirRelleno();
Pizza getPizza();
}