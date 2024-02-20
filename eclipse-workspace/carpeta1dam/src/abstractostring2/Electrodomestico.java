package abstractostring2;



class Electrodomestico extends Producto {
    private String marca;
    
    public Electrodomestico(String nombre, String descripcion, double precio, String marca) {
        super(nombre, descripcion, precio);
        this.marca = marca;
    }
    
    
	public String getMarca() {
		return marca;
	}


	@Override
    public String toString() {
    	
	return super.toString()+ " marca: "+marca;
    	
    
    };
}
