package crud;

class Libro extends Producto {
	private String autor;
	private int numPaginas;


	public Libro(String nombre, double precio, String autor, int numPaginas) {
		super(nombre, precio);
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Autor: " + autor + " Número de páginas: " + numPaginas);
	}


}