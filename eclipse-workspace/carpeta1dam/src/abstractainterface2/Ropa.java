package abstractainterface2;



class Ropa extends Producto {
    private String color;
    private String talla;
    
    public Ropa(String nombre, String descripcion, double precio, String color, String talla) {
        super(nombre, descripcion, precio);
        this.color = color;
        this.talla=talla;
    }
    
    @Override
    public void MostrarInformacion() {
    	super.MostrarInformacion();
        System.out.println("Color: " + color);
        System.out.println("talla: " + talla);
    }

	@Override
	public void SuCompra() {
		// TODO Esbozo de método generado automáticamente
		System.out.println("Ha comprado un electrodomestico, gracias");
	}
}
