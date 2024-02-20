package objetosBinarios;
 
import java.io.*;
 
public class ReadFichObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Empleado empleado; // definir  la variable empleado
		File fichero = new File (".\\src\\fichempleado.dat");
		ObjectInputStream dataIN = new ObjectInputStream(new FileInputStream(fichero));
 
		int i = 1;
		try {
			while (true) { // lectura del fichero
				empleado = (Empleado) dataIN.readObject(); // leer un empleado
				System.out.println(i + " => "+empleado.getNombre()+", "+empleado.getAntiguedad());
				i++;
			}
		} catch (EOFException eo) { // se produce esta excepcion al llegar al final del fichero
			System.out.println("FIN DE LECTURA.");
		} catch (StreamCorruptedException x) {
			x.printStackTrace();
		}
 
		dataIN.close(); // cerrar stream de entrada
	}
}
 
