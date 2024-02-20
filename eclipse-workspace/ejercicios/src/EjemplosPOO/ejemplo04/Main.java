package EjemplosPOO.ejemplo04;
public class Main
{
    public static void main(String[] args)
    {
        Animal p = new Perro();
        p.setNombre("TOBI");
        p.comer();
        p.caminar();
        p.sonido();
        System.out.println("-------------");
        Animal g = new Gato();
        g.setNombre("MICIFUS");
        g.comer();
        g.caminar();
        g.sonido();
    }
}