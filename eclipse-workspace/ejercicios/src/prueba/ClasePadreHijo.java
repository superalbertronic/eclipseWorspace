package prueba;

import java.util.Scanner;
import javax.swing.*;

public class ClasePadreHijo {
    protected Scanner teclado;
    protected String valor1;
    protected String valor2;
    protected int resultado;
    protected int valoreal1;
    protected int valoreal2;
   
    public ClasePadreHijo() {
        teclado=new Scanner(System.in);
    
    }
    
    public void cargar1() {
        //System.out.print("Ingrese el primer valor:");
        //valor1=teclado.nextInt();    
    	valor1 = JOptionPane.showInputDialog("primer numero");
        valoreal1 = Integer.parseInt(valor1);
    	    			
    }
    
    public void cargar2() {
        valor2 = JOptionPane.showInputDialog("segundo numero");		
        valoreal2 = Integer.parseInt(valor2);
        
    }
    
    public void mostrarResultado() {
        JOptionPane.showMessageDialog(null, "El resultado es "+resultado);
        System.out.println(resultado);
    }
}











