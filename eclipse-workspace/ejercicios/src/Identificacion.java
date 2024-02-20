import javax.swing.*; // Libreria para salida grafica por pantalla (ventana)

public class Identificacion {
	
	public static void main(String[] args) {
	
 //DECLARACION
 String [][] UsuPass = {{"Alberto","123"},
		 				{"paco","456"},
		 				{"pepe","789"}}; // Matriz de datos
 int Posicion = 0; // Identifica la posicion
 boolean Encontrado = false; //Identifica si encuentra el usuario
 String Texto = "";
 
 //ENTRADA DE DATOS
     String user=JOptionPane.showInputDialog ("Ingrese Usuario: "); //Lee Ususario
     String pass=JOptionPane.showInputDialog ("Ingrese Password: "); //Lee Password
 
 // ALGORITMO.
   //Comprueba usuario
     for (int i = 0;i < UsuPass.length;i++) {
    	 if (UsuPass[i][0].equals(user)){
    		 Posicion = i; // Guarda la fila donde lo encontró
    		 Encontrado = true; // Cambia Encontrado a Verdadero
    		 break; //Sale del bucle
    	 }
     }
 // Comprueba la password
     if (Encontrado & (UsuPass[Posicion][1].equals(pass))) {
  	     Texto= "   Identificacion Correcta";
  } else Texto = "  Identificacion Incorrecta";
 
   //SALIDA DE DATOS
    JFrame Ventana = new JFrame("Notas"); //Creamos objeto Ventana
    JLabel Label = new JLabel (Texto); // Creamos objeto Label que aparecerá en la ventana
    Ventana.getContentPane().add(Label);  //Asignamos a la Ventana el Contenido de Label
 	Ventana.setBounds(500, 300, 180, 100);  // Definir la posicion x,y y el Largo, Ancho de la Ventana
	Ventana.setVisible(true);// Hacemos visible la pantalla
	}
}