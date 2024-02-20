package interfacegraficas;

import javax.swing.*;

public class InterfazMysql extends JFrame {

	private JButton btnBuscar;
	private JTable tablaResultados;

	public InterfazMysql() {
// Configurar la ventana
		setTitle("Ejemplo de acceso a datos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);

// Crear el botón
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(e -> {
// Evento de clic en el botón
			buscarDatos();
		});

// Crear la tabla
		tablaResultados = new JTable();

// Agregar los componentes a la ventana
		JPanel panel = new JPanel();
		panel.add(btnBuscar);
		panel.add(new JScrollPane(tablaResultados));
		getContentPane().add(panel);
	}

	private void buscarDatos() {
// Implementar la búsqueda de datos
	}

	public static void main(String[] args) {
		InterfazMysql ventana = new InterfazMysql();
		ventana.setVisible(true);
	}
}
