package joptionpane;

import javax.swing.JOptionPane;

public class JoptionRepaso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dialogo;
		dialogo=JOptionPane.showConfirmDialog(null, "que quieres hacer",
				"eleccion",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
		if (dialogo==JOptionPane.YES_OPTION) {
			System.out.println("has pulsado yes");
		}else if(dialogo==JOptionPane.NO_OPTION) {
			System.out.println("has pulsado no");
		}else {
			System.out.println("has pulsado cancel");
		}	
						
		}	
			
	}

