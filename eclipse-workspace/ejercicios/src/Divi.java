import javax.swing.JOptionPane;

public class Divi {

	public static void main(String[] args) {
		String PrimerNumero, SegundoNumero; 
		int NumeroUno, NumeroDos, Divi; 
		
		PrimerNumero = JOptionPane.showInputDialog("Introduzca el primer entero");
		SegundoNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");
		
		NumeroUno = Integer.parseInt(PrimerNumero);
		NumeroDos = Integer.parseInt(SegundoNumero);
		
		Divi = NumeroUno - NumeroDos;
		
		JOptionPane.showMessageDialog(null, "La división es " + Divi, "Resultado", JOptionPane.PLAIN_MESSAGE);
	}

}
