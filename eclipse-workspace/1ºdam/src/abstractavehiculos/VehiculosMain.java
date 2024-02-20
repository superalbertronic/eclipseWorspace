package abstractavehiculos;

public class VehiculosMain {
	public static void main(String[] args) {
	Coche renault = new Coche();
    renault.color = "rojo";
    renault.ruedas = 4;
    renault.modelo = "Renault";
    renault.cilindrada = 1600;
    System.out.print(" Modelo: "+renault.modelo);
    System.out.print(" Ruedas: "+renault.ruedas);
    System.out.print(" cilindrada: "+renault.cilindrada);
    System.out.print(" color: "+renault.color);
    renault.acelerar();
    renault.frenar();

    
    Bicicleta mountainBike = new Bicicleta();
    mountainBike.color = "verde";
    mountainBike.ruedas = 2;
    mountainBike.modelo = "Mountain Bike";
    mountainBike.tipo = "montaña"; //bicicleta
    System.out.print(" modelo: "+mountainBike.modelo);
    System.out.print(" ruedas: "+mountainBike.ruedas);
    System.out.print(" tipo: "+mountainBike.tipo);
    System.out.print(" color: "+mountainBike.color);
    mountainBike.acelerar();
    mountainBike.frenar();
    
    
    
    
  }

}
