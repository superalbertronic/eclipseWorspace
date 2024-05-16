package prototype;

//Implementación concreta de Prototype para un ordenador de sobremesa
class OrdenadorSobremesa implements Ordenador {
private String procesador;
private int ram;
int almacenamiento;
private String placa;

public OrdenadorSobremesa(String procesador, int ram, int almacenamiento, String placa) {
   this.procesador = procesador;
   this.ram = ram;
   this.almacenamiento = almacenamiento;
   this.placa=placa;
}

// Constructor de copia para clonar el ordenador de sobremesa
public OrdenadorSobremesa(OrdenadorSobremesa otroOrdenador) {
   this.procesador = otroOrdenador.procesador;
   this.ram = otroOrdenador.ram;
   this.almacenamiento = otroOrdenador.almacenamiento;
   this.placa=otroOrdenador.placa;
}

@Override
public OrdenadorSobremesa clonar() {
   return new OrdenadorSobremesa(this);
}

@Override
public void especificaciones() {
   System.out.println("Especificaciones del ordenador de sobremesa:");
   System.out.println("Procesador: " + procesador);
   System.out.println("RAM: " + ram + "GB");
   System.out.println("Almacenamiento: " + almacenamiento + "GB");
   System.out.println("Placa; "+placa);
}
}