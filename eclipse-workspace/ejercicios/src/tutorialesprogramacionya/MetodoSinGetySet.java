package tutorialesprogramacionya;

public class MetodoSinGetySet {

	
	private String name;
	//definimos el constrctor sin parametros

	 // Sobrecarga de constructores
	public MetodoSinGetySet () {
		this.name="";
		}
	//definimos un metodo, set, para introducir el nombre
	public void Darnombre (String name) {
		System.out.println(name);
		}
	
	//metodo get para devolver o mostrar el nombre
	
	//creamos un objeto y llamamos al get
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		MetodoSinGetySet  s=new MetodoSinGetySet ();
		s.Darnombre("Alberto");
		
	}

}
