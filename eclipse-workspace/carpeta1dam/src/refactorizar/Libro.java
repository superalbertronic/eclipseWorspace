package refactorizar;



class Libro extends Producto {
    private String autor;
    
    public Libro(String nombre, String descripcion, double precio, String autor) {
        super(nombre, descripcion, precio);
        this.autor = autor;
    }
    
   
    public String getAutor() {
		return autor;
	}


	@Override
    public String toString() {
    	
	return super.toString()+ " Autor: "+autor;
    	
    
    };
}

