
import javax.swing.*; // Libreria para salida grafica por pantalla (ventana)

public class MatrizAdition {
       
        public static void main(String[] args) {
       

 //DECLARACION
 int [] notas = new int [10]; // Array para las notas
 int [] Resultado = new int [11]; // Array para los resultados
 
 //ENTRADA DE DATOS
 for (int i=0; i <10; i++) {  
     String nota=JOptionPane.showInputDialog ("Ingrese Nota " + (i+1)); //Entrada de datos por pantalla
     //Comprobamos que el numero está entre 0 y 10
     if (Integer.parseInt(nota)>=0 && Integer.parseInt(nota)<=10) {
             notas[i]=Integer.parseInt(nota); //Metemos el valor en el vector
             Resultado[i] = 0; // Inicialiazar el vector Resultados
     }
     else  i--; // si el numero no está entre 0 y 10 vuleve a pedir el valor
     
        }
 
 // ALGORITMO. Calcula la cantidad de notas de cada tipo
 for (int i=0; i <10; i++) {
                 Resultado[notas[i]] = Resultado[notas[i]] +1;
         }
 
 //SALIDA DE DATOS
        JFrame Ventana = new JFrame("Notas"); //Creamos objeto Ventana
        String Texto = ""; //Inicializamos el Texto a mostrar en la ventana
       
 for (int i=1; i <11; i++) {
         Texto = Texto.concat(i + ": "+ Resultado[i] + " notas / ");  // Generamos el texto

 }
         
    JLabel Label = new JLabel (Texto); // Creamos objeto Texto que aparecerá en la ventana
    Ventana.getContentPane().add(Label);  //Asignamos a la Ventana el Contenido de Label
         Ventana.setBounds(500, 300, 700, 100);  // Definir la posicion x,y y el Largo, Ancho de la Ventana
        Ventana.setVisible(true);// Hacemos visible la pantalla
        }
}