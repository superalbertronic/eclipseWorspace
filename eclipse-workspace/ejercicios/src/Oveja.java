public class Oveja extends Animal{
	//Atributos
	int patas;
	
	//Getters & Setters
	public int getPatas() {
		return patas;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	//Constructor
	public Oveja(String nombre, int patas) {
		super(nombre);
		this.patas = patas;
	}
	
	
	//Metodos implementados de la clase abstracta Animal
	@Override
	void sonido() {
		System.out.println("BEEEE!");
	}

	@Override
	void comer() {
		System.out.println("Ñam ñam!");
	}

	@Override
	String saludar() {
		return "Mi cabra dice BEEEE y yo digo TIIII";
	}
}