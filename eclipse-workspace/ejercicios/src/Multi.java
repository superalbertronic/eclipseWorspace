import javax.swing.JOptionPane;

public class Multi {

	public static void main(String[] args) {
		String PrimerNumero, SegundoNumero; 
		int NumeroUno, NumeroDos, Multi; 
		
		PrimerNumero = JOptionPane.showInputDialog("Introduzca el primer entero");
		SegundoNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");
		
		NumeroUno = Integer.parseInt(PrimerNumero);
		NumeroDos = Integer.parseInt(SegundoNumero);
		
		Multi = NumeroUno - NumeroDos;
		
		JOptionPane.showMessageDialog(null, "La multiplicacion es " + Multi, "Resultado", JOptionPane.PLAIN_MESSAGE);
	}

}
