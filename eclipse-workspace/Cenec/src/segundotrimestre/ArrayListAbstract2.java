package segundotrimestre;
import java.util.ArrayList;

//clase abstracta
abstract class animales{
	String denominacion;
	String tipo;
	public animales(String denominacion, String tipo) {
		super();
		this.denominacion = denominacion;
		this.tipo = tipo;
	}
@Override
public String toString() {
	return "denominacion "+denominacion+" especie "+tipo;
}
}

//clase mamifero

class mamifero extends animales{

	public mamifero(String denominacion, String tipo) {
		super(denominacion, tipo);
		// TODO Auto-generated constructor stub
	}
	
	
}



public class ArrayListAbstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<animales> listaAnimales=new ArrayList();	//instanciamos creando un nueva lista en blanco.
		listaAnimales.add(new mamifero("Gato","felino")); //rellenanmos instanciando de la clase mamifero
		listaAnimales.add(new mamifero("perro","canino"));
		for (animales animals:listaAnimales) { //listado de los animales
			System.out.println(animals);
			
			
		}
		
		
	}

}
