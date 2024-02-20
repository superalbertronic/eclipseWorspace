package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
	private Vista v;
	private Modelo m;

	public Controlador(Vista v, Modelo m) {
		this.v = v;
		this.m = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		if (isButtonNumber(comando)) {
			v.putText(m.establecerNumero(comando, v.readText()));
		} else if (comando.equals("=")) {
			v.putText(m.establecerResultado(v.readText()));
		} else if (comando.equals("C")) {
			v.putText(m.establecerReset());
		} else if (comando.equals(".")) {
			v.putText(m.establecerPunto(comando, v.readText()));
		} else {
			v.putText(m.establecerOperacion(comando,v.readText()));
		}
	}
	
	private boolean isButtonNumber(String text) {
		return Character.isDigit(text.charAt(0));
	}
}