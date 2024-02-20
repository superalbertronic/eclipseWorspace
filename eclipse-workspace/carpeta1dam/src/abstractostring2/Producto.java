package abstractostring2;



abstract class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private static double iva=0.21;
    
    public Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    @Override
    public String toString() {
    	
		return "Nombre: "+nombre+" Descripcion: "+descripcion+ " Precio: "+precio +" Iva "+
				precio*iva + " total "+(precio + (precio * iva));
    	
    
    };
   
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
