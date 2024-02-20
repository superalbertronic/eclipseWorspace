package Abstractainterface4;

public class Ropa implements ProductoInterfaz{

	private int talla;
	private String color;
	private String marca;
	
	public Ropa(int talla, String color, String marca) {
		super();
		this.talla = talla;
		this.color = color;
		this.marca = marca;
	}
	
	@Override
    public void MostrarInformacion() {
        System.out.println("Talla: " + talla);
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
    }
	
}
