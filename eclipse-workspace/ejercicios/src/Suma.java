import javax.swing.JOptionPane;

public class Suma {

	public static void main(String[] args) {
		String PrimerNumero, SegundoNumero; 
		int NumeroUno, NumeroDos, Suma; 
		
	   
		
		PrimerNumero = JOptionPane.showInputDialog("Introduzca el primer entero");
		SegundoNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");
		
		NumeroUno = Integer.parseInt(PrimerNumero);
		NumeroDos = Integer.parseInt(SegundoNumero);
		
		Suma1 = NumeroUno + NumeroDos;
		
		JOptionPane.showMessageDialog(null, "La suma es " + Suma1, "Resultado", JOptionPane.ERROR_MESSAGE);
	}

}
