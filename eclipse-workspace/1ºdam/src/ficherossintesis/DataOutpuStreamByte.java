package ficherossintesis;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutpuStreamByte {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		byte CR=13;
		try {
			FileOutputStream fos= new FileOutputStream ("c:\\ficheros\\fich1.bin");
			DataOutputStream dos= new DataOutputStream (fos);
			//la carpeta ficheros tiene que estar creada en este ejercicio
			String texto="Prueba de DataOutputStream";
			dos.writeUTF(texto);
			int numero=22;
			dos.write(CR);
			dos.writeInt(numero);
			//EL CONTENIDO ENTERO NO SERÁ LEGIBLE ENTERO PORQUE ES UN BINARIO+
							
			fos.close();
			dos.close();
			System.out.println("Fichero creado");
		}
		catch (IOException ioe) {
		     System.out.println("error"+ioe.getMessage());
		}
		
		
	}

}
