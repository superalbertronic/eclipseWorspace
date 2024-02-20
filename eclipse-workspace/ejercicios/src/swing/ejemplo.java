package swing;
import java.lang.*;
import javax.swing.*;
public class ejemplo extends JFrame {
    private JLabel label1,label2,label3;
    
    public ejemplo() {
        getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(247, 80, 143, 133);
        getContentPane().add(panel);
        label3=new JLabel("Azul");
        panel.add(label3);
        label2=new JLabel("Verde");
        panel.add(label2);
        label1=new JLabel("Rojo");
        panel.add(label1);
    }
    
    public static void main(String[] ar) {
        ejemplo formulario1=new ejemplo();
        formulario1.setBounds(0,0,300,200);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
