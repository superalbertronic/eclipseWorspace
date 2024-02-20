package ficherossintesis;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutpuStreamByte {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		byte CR=13;
		byte LF=10;
		try {
			FileOutputStream fos= new FileOutputStream ("c:\\ficheros\\fich1.bin");
			//la carpeta ficheros tiene que estar creada en este ejercicio
			fos.write((byte)'a');
			fos.write(CR);
			fos.write((byte)'e'); 
			fos.write(CR);
			fos.write((byte)'i');
			fos.write(CR);
			fos.write((byte)'c');
			fos.write(CR);
			fos.write((byte)'u');
			
			fos.write(LF);
			fos.close();
			System.out.println("Fichero creado");
		}
		catch (IOException ioe) {
		     System.out.println("error");
		}
		
	}

}
