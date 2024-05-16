package AdapterBásico;

public class Main {
    public static void main(String[] args) {
       // Cuadrado cuadrado = new Cuadrado(5);
       // System.out.println("Área del cuadrado: " + cuadrado.obtenerArea());

        Circulo circulo = new Circulo(3);
        //Forma circo = new CirculoAdapter(circulo);
        Forma circuloAdaptado=new CirculoAdapter(circulo);
        CirculoAdapter circuloAdaptado2=new CirculoAdapter(circulo);
        
        //si intento acceder a mensaje que es un metodo de circulo Adapter no puedo
        //porque solo puedo acceder a los metodos que son implementados de la interfaz forma
        System.out.println("Área del círculo: " + circuloAdaptado.obtenerArea());
        
        //en este caso si puedo hacerlo
        System.out.println("Área del círculo: " + circuloAdaptado2.obtenerArea());
        System.out.println("informe: " + circuloAdaptado2.mensaje());
        //si intento acceder a los metodos de circuloadapter no puedo salvo a 
    }
}
