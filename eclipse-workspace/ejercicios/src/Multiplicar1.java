public class Multiplicar1 {
    private int tabla;
    private int terminos;
    
    public Multiplicar1(int ta,int ter) {
        tabla=ta;
        terminos=ter;
    }

    public Multiplicar1(int ta) {
        tabla=ta;
        terminos=10;
    }
    
    
    public void imprimir() {
        System.out.println("Tabla de multiplicar del "+tabla);
        for(int f=1;f<=terminos;f++) {
            int resultado=f*tabla;
            System.out.println(tabla + "*" + f + " = " + resultado);
        }
    }
    
    public static void main(String[] ar) {
        Multiplicar1 tabla1=new Multiplicar1(5);
        tabla1.imprimir();
        Multiplicar1 tabla2=new Multiplicar1(3,5);
        tabla2.imprimir();
    }
}