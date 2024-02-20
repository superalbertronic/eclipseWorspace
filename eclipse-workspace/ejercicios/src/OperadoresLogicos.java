import javax.swing.*;

 public class OperadoresLogicos {
 public static void main( String args[] )
 {
 JTextArea areaSalida = new JTextArea( 17, 20 );
 JScrollPane desplaza = new JScrollPane( areaSalida );
 String salida = "";

 salida += " AND Logico (&&)" +
 "\nfalso && falso: " + ( false && false ) +
 "\nfalso && verdadero: " + ( false && true ) +
 "\nverdadero && falso: " + ( true && false ) +
 "\nverdadero && verdadero: " + ( true && true );
 
 salida += "\n\n OR Logico (||)" +
		  "\nfalso || falso: " + ( false || false ) +
		  "\nfalso || verdadero: " + ( false || true ) +
		  "\nverdadero || falso: " + ( true || false ) +
		  "\nverdadero || verdadero: " + ( true || true );
		 
		  salida += "\n\nAND Logico Booleano (&)" +
		  "\nfalso & falso: " + ( false & false ) +
		  "\nfalso & verdadero: " + ( false & true ) +
		  "\nverdadero & falso: " + ( true & false ) +
		  "\nverdadero & verdadero: " + ( true & true );
		 
		  salida += "\n\n OR Logico Booleano Incluyente (|)" +
		  "\nfalso | falso: " + ( false | false ) +
		  "\nfalso | verdadero: " + ( false | true ) +
		  "\nverdadero | falso: " + ( true | false ) +
		  "\nverdadero | verdadero: " + ( true | true );
		 
		  salida += "\n\nOR Logico Booleano Excluyente (^)" +
		  "\nfalso ^ falso: " + ( false ^ false ) +
		  "\nfalso ^ verdadero: " + ( false ^ true ) +
		  "\nverdadero ^ falso: " + ( true ^ false ) +
		  "\nverdadero ^ verdadero: " + ( true ^ true );
		 
		  salida += "\n\nNOT Logico (!)" +
		  "\n!falso: " + ( !false ) +
		  "\n!verdadero: " + ( !true );
		 
		  areaSalida.setText( salida );
		  JOptionPane.showMessageDialog( null, desplaza,
		  "Tablas de verdad", JOptionPane.INFORMATION_MESSAGE );
		  System.exit( 0 );
		  } 
 }
		