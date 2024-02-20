package alumnos;
import javax.swing.*;
public class erroresinicio {
    public static void main(String[] args) {
        String usuario;
        String confim="COSITASRICA";
        do{
        usuario = JOptionPane.showInputDialog(null,"Porfavor coloque el usuario");
        if(usuario.length()<10){
            JOptionPane.showMessageDialog(null, "Usuario incorrecto. (Recuerde debe de contener mas de 10 caracteres)");
            usuario = JOptionPane.showInputDialog(null,"Porfavor coloque el usuario");
      
        }else if (usuario.equals(confim)){
            JOptionPane.showMessageDialog(null, "Usuario correcto");}
      
            else{
            JOptionPane.showMessageDialog(null, "Usuario incorrecto. (Recuerde debe de contener mas de 10 caracteres)");
        }
        
        }while(usuario!=confim);
        

        

        }
     }