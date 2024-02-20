package tercertrimestre;
import javax.swing.*;
import java.awt.FlowLayout;

public class Ejerciciografico1 {
    public static void main(String[] args) {
        // Crear una ventana JFrame
        JFrame ventana = new JFrame("Mi Formulario");
        ventana.setSize(400, 200); // Tamaño de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana
        
        // Crear una etiqueta JLabel
        JLabel etiqueta = new JLabel("Nombre:");
        
        // Crear un campo de texto JTextField
        JTextField campoTexto = new JTextField(20); // 20 caracteres de ancho
        
        // Crear un contenedor JPanel para organizar los elementos
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel.add(etiqueta);
        panel.add(campoTexto);
        
        // Agregar el panel al contenido de la ventana
        ventana.getContentPane().add(panel);
        
        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
