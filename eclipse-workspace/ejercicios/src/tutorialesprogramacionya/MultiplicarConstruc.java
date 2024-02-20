package tutorialesprogramacionya;

public class MultiplicarConstruc {
    private int tabla;
    private int terminos;
    
    public MultiplicarConstruc(int ta,int ter) {
        tabla=ta;
        terminos=ter;
    }

    public MultiplicarConstruc(int ta) {
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
        MultiplicarConstruc tabla1=new MultiplicarConstruc(5);
        tabla1.imprimir();
        MultiplicarConstruc tabla2=new MultiplicarConstruc(3,5);
        tabla2.imprimir();
    }
}