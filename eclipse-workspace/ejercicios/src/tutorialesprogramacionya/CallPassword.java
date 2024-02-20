package tutorialesprogramacionya;


import javax.swing.JOptionPane;

public class CallPassword {

public static void main(String[] args) {
int largo=Integer.parseInt(JOptionPane.showInputDialog("introduzca la longitud de la contraseña"));

Password1 P= new Password1(largo);
P.setLongitud(largo);
P.generarPassword();
P.getContrasena();

P.esFuerte();


}

}