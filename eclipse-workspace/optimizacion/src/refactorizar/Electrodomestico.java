package refactorizar;



class Electrodomestico extends Producto implements prueba1 {
    private String marca;
    
    public Electrodomestico(String nombre, String descripcion, double precio, String marca) {
        super(nombre, descripcion, precio);
        this.marca = marca;
    }
    
    
	@Override
	public String getMarca() {
		return marca;
	}


	@Override
    public String toString() {
    	
	return super.toString()+ " marca: "+marca;
    	
    
    }}
