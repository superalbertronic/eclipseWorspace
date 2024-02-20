package abstractaATS;

public class Planta extends SerVivo{

    @Override // Indica a Java que está sobreescribiendo el método abstracto de la clase padre
    public void alimentarse(){
        System.out.println("La planta se alimenta a través de la fotosíntesis");
    }
}
