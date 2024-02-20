import javax.swing.JOptionPane;

public class Resta {

	public static void main(String[] args) {
		String PrimerNumero, SegundoNumero; 
		int NumeroUno, NumeroDos, Resta; 
		
		PrimerNumero = JOptionPane.showInputDialog("Introduzca el primer entero");
		SegundoNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");
		
		NumeroUno = Integer.parseInt(PrimerNumero);
		NumeroDos = Integer.parseInt(SegundoNumero);
		
		Resta = NumeroUno - NumeroDos;
		
		JOptionPane.showMessageDialog(null, "La resta es " + Resta, "Resultado", JOptionPane.ERROR_MESSAGE);
	}

}
