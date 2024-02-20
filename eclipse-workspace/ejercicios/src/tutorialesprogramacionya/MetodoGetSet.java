package tutorialesprogramacionya;

public class MetodoGetSet {

	//get y set se usan para poder acceder y modificar propiedas privadas,
	//se entiende cuando se usan desde una subclase
	
	private String name;
	//definimos el constrctor sin parametros

	 // Sobrecarga de constructores
	public MetodoGetSet () {
		
		}
	//definimos un metodo, set, para introducir el nombre
	public void setName (String name) {
		this.name=name;
		}
	
	//metodo get para devolver o mostrar el nombre
	public String getName(){
	return name;
	}
	
	//creamos un objeto y llamamos al get
	

}
