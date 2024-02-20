package salario;

import java.util.Scanner;
public class MetodoConstructor {
    private Scanner teclado;
    private int[] sueldos;
    private double irpf;
    //metodo constructor
    public MetodoConstructor()
    {
    	teclado=new Scanner(System.in);
        sueldos=new int[5];
        irpf=0.15;
       
        for(int f=0;f<5;f++) {
            System.out.print("Ingrese el valor del sueldo:");
            sueldos[f]=teclado.nextInt();
        }	
    }
	// metodo imprimir
    public void imprimir() {
        for(int f=0;f<5;f++) {
            System.out.println("sueldo "+ f + " : " +sueldos[f]);
        }
    }
    public void irpf() {
        for(int f=0;f<5;f++) {
            System.out.println("sueldo "+ f + " : " +sueldos[f]);
        }
    }
    //ejemplo añadido calculo de la media
    public void media() {
    	int suma=0;
    	for(int f=0;f<5;f++) {
           suma+=sueldos[f];
        }
    	System.out.println("la suma de sueldos es € "+suma);
    	 System.out.println("la media es "+suma/sueldos.length);
    }
    //main
    
    public void anual (int incremento) {
    	 int increment=0;
    	 for(int f=0;f<5;f++) {
    		increment=sueldos[f]+incremento;
            System.out.println("Sueldo+incremento "+increment);
         }
    	
    	
    	
    	
    	
    }
    
    public static void main(String[] ar) {
        MetodoConstructor operario=new MetodoConstructor();
        operario.imprimir();
        operario.media();
        operario.anual(200);
    }
}
