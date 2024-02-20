public class Main {
	public static void main(String[] args) {
		Oveja oveja = new Oveja("Dory", 4);
		System.out.println(oveja.saludar());
		System.out.println(oveja.nombre);
		System.out.println(oveja.patas);
		oveja.comer();
		oveja.sonido();
	}
}